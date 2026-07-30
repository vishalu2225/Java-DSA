import java.util.Scanner;

public class TakingInput
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first  Number:");
        int first=sc.nextInt();
        System.out.println("Enter second  Number:");
        int second=sc.nextInt();
        int ans=first+second;
        System.out.println("Total:"+ans);
        boolean bg=sc.nextBoolean();
        short s=sc.nextShort();
        float f=sc.nextFloat();
        sc.close();

    }
}
