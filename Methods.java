public class Methods
{
    static int num=5;
    //method declaration/definition
    static void print2table()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(2 * i);
        }
    }
//parameter
     static void printSum(int x,int y){

        System.out.println("Sum " +(x+y));


    }



    //void
     static void printMul(int a,int b)
    {
        System.out.println("Result " +(a*b));
    }
    //no void
    static  int add(int p,int q){
        int sum=p*q;
        return sum;
    }
    //method overloading[same name with different parametera]

    //changing return type by float its not method overloading
    static float add1(float a,float b){
        return a+b;
    }

    //changing parameter is called method overloading
    static int add1(int a,int b){
        return a+b;
    }
    static int add1(int a,int b,int c){
        return a+b+c;
    }

    //call by value
    static void solve(int num){
        System.out.println("INSIDE SOLVE:"+num);
        num=num*10;
        System.out.println("INSIDE SOLVE:"+num);

    }

    static void printmultiplication()
    {

        for(int i=1;i<=10;i++)
        {
            System.out.println(20*i);

        }
    }
    public static void main(String[] args)
    {
        //calling method overloading
        float ans1=add1(10.0f,25.0f);
        System.out.println("ans1 "+ans1);
        System.out.println("ans2 "+add1(10,20));
        System.out.println("ans3 "+add1(10,20,20));

        System.out.println("hii");

        //method call

        //function call without parameter
        print2table();

        //parameter
        printSum(5,10);

        //void
        printMul(2,5);

        //non void with return
        int result=add(1,20);
        System.out.println("answer:"+result);



        //call by value calling

        System.out.println("INSIDE MAIN:"+num);
        solve(num);
        System.out.println("INSIDE MAIN:"+num);


        printmultiplication();

        System.out.println("bye");
    }
}