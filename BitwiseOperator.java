public class BitwiseOperator
{
    static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(a&b);//4
        System.out.println(a|b);//7
        System.out.println(a^b);//3
        System.out.println(~a);//-6


        //Bitwise Left shift(<<)
        int n=1;
        for(int i=1;i<=32;i++)
        {
            n=n<<1;
            System.out.print(" "+n);// 2 4 8 16 32 64 128 256 512 1024 2048 4096 8192 16384 32768 65536 131072 262144 524288 1048576 2097152 4194304 8388608 16777216 33554432 67108864 134217728 268435456 536870912 1073741824 -2147483648 0

        }
        System.out.println();
        //Bitwise Right shift(>>)
        int m=100;
        for(int i=1;i<=10;i++)
        {
            m=m>>1;
            System.out.print(" "+m);// 50 25 12 6 3 1 0 0 0 0

        }
        System.out.println();
        //Bitwise unsigned Right shift(>>.)
        int m1=100;
        for(int i=1;i<=10;i++)
        {
            m1=m1>>1;
            System.out.print(" "+m1);// 50 25 12 6 3 1 0 0 0 0

        }
        //Even or odd
        System.out.println();

        int n2=11;//ODD
        if((n2&1)==0) {
            System.out.println("Even");
        }
        else
            System.out.println("odd");


        //count bit set
        int n3=5;
        int count=0;
        while (n3 != 0 ){
            if((n3 & 1)!=0)
            {
                count++;
            }

            //right shift to remove this bit
            n3=n3>>1;

        }
        System.out.println(count);//2

        //poower of 2
        int n4=16;//poer of 2
        if((n4&(n4-1))==0)
        {
            System.out.println("power of 2");
        }
        else {
            System.out.println("not power of 2");
        }

        System.out.println(3<<2);//12
        System.out.println(16>>2);//4


        int n5=10;
        System.out.println(n5&(n5-1));//8(remove last set bit)
        System.out.println(n5&(-n5));//2(get last set bit and set last set bit as it is other bcms 0


    }
}
