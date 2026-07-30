public class Datatype
{
    public static void main(String[] args)
    {
        byte n=127;
        System.out.println(n);//127
       // byte n1=500;//can't because of range
       // System.out.println(n1);
        short n2=32767;
        System.out.println(n2);
        short n3=5000;
        System.out.println(n3);
        long n4=398580767;
        System.out.println(n4);
        float n5=3.149078798f;
        System.out.println(n5);
        double n6=3.1490787987888;
        System.out.println(n6);
        boolean eligibletovote=true;
        System.out.println(eligibletovote);

        char a='a';
        System.out.println(a);//a
        char a1='a';
        System.out.println(a1+2);//99
        char a2='a';
        System.out.println((char)(a2+2));//c
        String b="hlo";
        System.out.println(b);

//implicit conversion
        byte n7=127;
        long newn7=n7;
        System.out.println(newn7);

//explicit conversion
    long n8=1234567899;
    int n9=(int)n8;
        System.out.println(n9);


    }
}
