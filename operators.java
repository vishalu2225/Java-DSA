public class operators
{
    public static void main(String[] args)
    {
        int a=25;
        int b=15;
//arithmetic operators
        int total=a+b;
        int difference=a-b;
        int projected=a*b;
        int average=a/b;
        int reaminder=a%b;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(reaminder);

        //relational operators
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        //logical operators
        boolean a1=true;
        boolean b1=false;
        System.out.println(a1&&b1);
        System.out.println(a1||b1);
        System.out.println(!a1);
        System.out.println(!b1);

        //asignment operators
        int a2=100;
        System.out.println(a2+=10);
        System.out.println(a2-=10);
        System.out.println(a2*=10);
        System.out.println(a2/=10);
        System.out.println(a2%=10);

        //unary increment and decrement
        int a3=100;
        System.out.println(a3++);
        System.out.println(++a3);
        System.out.println(a3--);
        System.out.println(--a3);


    }
}
