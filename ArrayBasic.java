public class ArrayBasic {

    //Find the average of arry elements
    static  double getAverage(int[] arr)
    {
        double sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        int size=arr.length;
        double avg =sum/size;
        return avg;
    }
    //Multiply each element of array by 10

    static int[] multiplyby10(int[] arr)
    {
        int size=arr.length;
        int newArray[]=new int[size];
        for(int i=0;i<size;i++)
        {
            int element=arr[i];
            int newelement=element*10;
            newArray[i]=newelement;
        }

        //return updated array
        return newArray;
    }

    //Search for an element in an Array{linear Search}
    static boolean findTarget(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target)
                return true;
        }
        //agar poora array travel ho chuka hai and ek bar bhi target nahi mila iska matlab,target is not present in the arry so return false
        return false;

    }

    //Find the maximum element in an array
    static int getMaximum(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        //jab  main yaha pahuchunga, toh poora arrayy compare ho chuka hoga
        //and max ke andar sabse badi value hogi
        return max;
    }

    //Return sum of +ve and -ve numbers
    static int[] getPositiveNegativeSum(int arr[])
    {
        int negSum=0;
        int posSum=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>0)
                //num is
                posSum=posSum+arr[i];
            else
                negSum=negSum+arr[i];

        }
        int ans[]={posSum,negSum};
        return  ans;
    }

    //Count the number of Zeroes and Ones
    static int[]getCountOf0And1(int[] arr)
    {
        int zeroCount=0;
        int oneCount=0;

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==1)
                oneCount++;
            else
                zeroCount++;
        }
        int ans[]={zeroCount,oneCount};
        return ans;
    }

    //Find First Unsorted element in array
    static  int unsortedelement(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i+1]<=arr[i]){
                return arr[i+1];
            }

        }
        //jis case main loop se bahar ajana par
        return -1;
    }


    static void main(String[] args) {
        int[] arr={-2,4,1,-3};
        System.out.println(getAverage(arr));//2.5

        int[] ans=multiplyby10(arr);
        System.out.println("printing ans array:");
        for(int i:ans)

        {
            System.out.print(i+" ");//printing ans array:
                                    //20 40 10 30
        }
        System.out.println();

        boolean find=findTarget(arr,1);
        System.out.println(find);//true

        int get=getMaximum(arr);
        System.out.println(get);//4

        int[] sum=getPositiveNegativeSum(arr);
        System.out.println("Positive sum"+sum[0]);
        System.out.println("Negaitive sum"+sum[1]);

        int[] arr1={0,1,0,1,0,1,1,1};

        int[] count=getCountOf0And1(arr1);
        System.out.println("Zero count"+count[0]);
        System.out.println("One count"+count[1]);

        int[] arr2={1,2,3,4,6,5};
        System.out.println(unsortedelement(arr2));//5



    }
}
