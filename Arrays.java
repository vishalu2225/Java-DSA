import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {
        //1-D Array


        //declaration
        int arr[];
        //allocation
        arr=new int[5];
        //initialisation
        int brr[]={10,20,30};
        //accesing element in array
        System.out.println("value at 0 index: "+brr[0]);
        System.out.println("value at 1 index: "+brr[1]);
        System.out.println("value at 2 index: "+brr[2]);

        //for each loop


        int crr[]={10,20,30,40,50};

        int n=crr.length;
        //for loop
        for(int index=0;index<=n-1;index++)
        {
            System.out.println(crr[index]);
        }
        //for each loop
        for(int val:crr){
            System.out.println(val);

        }

        //taking input in an array
        System.out.println("taking input");
        int arr1[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int n1=arr1.length;
        //input
        for(int i=0;i<=n1-1;i++)
        {
            System.out.println("provide index for "+i);
            arr1[i]=sc.nextInt();
        }
        //print
        System.out.println("your array contains:");
        for(int val1:arr1){
            System.out.println(val1);
        }


        //practice
        int array[]={10,20,200};
        int number=array.length;

        //1.adding all elements in the array
        int sum=0;
        System.out.println("practising");
        for(int i=0;i<=number-1;i++)
        {
            int value=array[i];
            sum=sum+value;


        }
        System.out.println("adding of numbers: "+sum);

        //2.multiplication of all elements

        int  answer=1;
        for(int i=0;i<=number-1;i++)
        {
            answer=answer*array[i];
        }
        System.out.println("multiplication:"+answer);


        //3.maximum element in the array
        int max=array[0];
        for(int i=0;i<=number-1;i++)
        {
            if(max<array[i])
            {
                //update max value
                max=array[i];
            }
        }

        System.out.println("maximum value: "+max);


        //4.minimum element in the array
        int min=array[0];
        for(int i=0;i<=number-1;i++)
        {
            if(min>array[i])
            {
                //update max value
                min=array[i];
            }
        }

        System.out.println("maximum value: "+min);



        //2-D Array

        //declaration
        int[][]a;
        //allocation
        a=new int[3][4];
        //initialisation
        int[][]b={
                {1,2,3},
                {1,2,3}

                };
        System.out.println(b[1][0]);

        //printing all elements in the row and column wise
        int rowlength=b.length;//row length  it uses when all row nos are same
        int collength=b[0].length;//column length for same column size
        for(int row=0;row<=rowlength-1;row++)
        {
            for(int col=0;col<=collength-1;col++)
            {
                System.out.print(b[row][col]+" ");
            }
            System.out.println();
        }

        //different column size
        int[][] c={
                {1,2,3},
                {1,2,3,4},
                {1,2,3,4,5},
                {1,2,3,4,5,6}
        };
        int rowlength1=c.length;//row length  it uses when all row nos are same
        for(int row=0;row<=rowlength1-1;row++)
        {
            //new row ge bandalike
            //astotige aa row da column length find madte
            //current row ->c[rowIndex]
            //idrage yest column ->c[rowIndex].length


            //when new row comes we have find column lenght of that row
            //current row->c[rowIndex]
            //column in that row-> c[rowindex].length
            int collenght1=c[row].length;

            for(int col=0;col<=collenght1-1;col++)
            {
                System.out.print(c[row][col]+" ");
            }
            System.out.println();
        }

        //or shorted form/ traversal 2D array
        for(int rowIndex=0;rowIndex<=c.length-1;rowIndex++)
        {
            for(int colIndex=0;colIndex<=c[rowIndex].length-1;colIndex++)
            {
                System.out.print(c[rowIndex][colIndex]+" ");
            }
            System.out.println();
        }

//TAKING INPUT AND PRINT
        int d[][]=new int[4][4];
        Scanner sc1=new Scanner(System.in);
        //Input
        for(int row=0;row<=d.length-1;row++)
        {
            for(int col=0;col<=d[row].length-1;col++)
            {
                System.out.println("Value for row="+row+"Value for column="+col);
                d[row][col]=sc1.nextInt();


            }

        }
        //i<=n-1 OR i<n
        //PRINT
        for(int rowIndex=0;rowIndex<=d.length-1;rowIndex++)
        {
            for(int colIndex=0;colIndex<=d[rowIndex].length-1;colIndex++)
            {
                System.out.print(d[rowIndex][colIndex]+" ");
            }
            System.out.println();
        }

        //PRACTISE
        //1.adding all no
        int[][]b1={
                {1,2,3},
                {1,2,3}

        };
        int sum1=0;
        for(int rowIndex=0;rowIndex<=b1.length-1;rowIndex++)
        {
            for(int colIndex=0;colIndex<=b1[rowIndex].length-1;colIndex++)
            {
               sum1=sum1+b1[rowIndex][colIndex];
            }

        }
        System.out.println(sum1);

        //2.multip[lication of no

        int mul1=1;
        for(int rowIndex=0;rowIndex<=b1.length-1;rowIndex++)
        {
            for(int colIndex=0;colIndex<=b1[rowIndex].length-1;colIndex++)
            {
                mul1=mul1*b1[rowIndex][colIndex];
            }

        }
        System.out.println(mul1);

        //3.max of no
        int max1=b[0][0];
        for(int rowIndex=0;rowIndex<=b1.length-1;rowIndex++)
        {
            for(int colIndex=0;colIndex<=b1[rowIndex].length-1;colIndex++)
            {
                if(b1[rowIndex][colIndex]>max1)
                {
                    max1=b1[rowIndex][colIndex];
                }
            }

        }
        System.out.println(max1);

        //4.min of no
        int min1=b[0][0];
        for(int rowIndex=0;rowIndex<=b1.length-1;rowIndex++)
        {
            for(int colIndex=0;colIndex<=b1[rowIndex].length-1;colIndex++)
            {
                if(b1[rowIndex][colIndex]<min1)
                {
                    min1=b1[rowIndex][colIndex];
                }
            }

        }
        System.out.println(min1);








    }


}
