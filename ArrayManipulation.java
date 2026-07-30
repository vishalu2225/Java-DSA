import java.util.HashMap;

public class ArrayManipulation
{
    //Reverse an array
    static  void reverseArray(int arr[])
    {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j) {
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            //i ko age badadhao
            i++;
            //j ko peeche lavo
            j--;
        }
        //number of array has been reversed
        //print
        for(int k:arr)
            System.out.print(" "+k);
    }

    //Shift array elements by 1 Position
    static void shiftByOnePos(int[] arr) {
        int n = arr.length;
        //step1:store last wale ki value in temp
        int temp = arr[n - 1];

        //step2:shift all values of array by one position
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        //step3:Copy the last value to first index[temp ki value ke 0 index par value]
        arr[0] = temp;
    }

    //Print Extreme Elements in an alternate manner
    static void printAllAlternate(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.println(arr[i]);
                return ;

            } else {
                //i<j
                System.out.print(arr[i]+" ");
                i++;
                System.out.print(arr[j]+" ");
                j--;
            }
        }
    }
    //Find the mode of the array
    static int getMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        /*
        for(int i:freq.keySet())
        {
            //i->represent key
            System.out.println(i+"  -> "+freq.get(i));
        }

         */
        int maxFreq = -1;
        int maxFreqWalikey = -1;
        for (int key : freq.keySet()) {

            int currentKey = key;
            int currentKeyFrequency = freq.get(key);
            if (currentKeyFrequency > maxFreq) {

                //muje naya max mil gaya
                maxFreq = currentKeyFrequency;
                maxFreqWalikey = currentKey;
            }
        }

        //jab loap se bahar aaoge toh max freq wali key ready hogi
        return maxFreqWalikey;
    }


    //Identify element with highest and lowest Frequency
    static int[] getHighLowFreqEle(int arr[]) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);

            if (currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highestNum = key;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;

        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);

            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = key;
            }
        }

        return new int[]{highestNum, lowestNum};
    }

    static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverseArray(arr);// 5 4 3 2 1

        int arr1[]={1,2,3,4,5};
        System.out.println();
        shiftByOnePos(arr1);
        for(int a:arr1)
            System.out.print(" "+a);//  5 1 2 3 4

        System.out.println();

        int arr2[]={1,2,3,4,5,6};

        printAllAlternate(arr2);//1 6 2 5 3 4

        System.out.println();
        int arr3[]={1,2,3,4,5,6,1,2,3,4,4,5,6,6,6};

        /*getMode(arr3);/*1  -> 2
                         2  -> 2
                         3  -> 2
                        4  -> 3
                         5  -> 2
                         6  -> 4*/

        int ans=getMode(arr3);
        System.out.println(ans);//6

        int[] ans1 = getHighLowFreqEle(arr3);

        System.out.println("Highest Frequency Element: " + ans1[0]);//6
        System.out.println("Lowest Frequency Element: " + ans1[1]);//1



    }

}
