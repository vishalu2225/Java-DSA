import java.util.Scanner;

public class condition
{
    public static void main(String[] args)
    {
        /*if stmt
        int dailypractice=12;
        if(dailypractice>=10)
        {
            System.out.println("Good consistency");
        }
        */

        /*if-else stmt
        int score=10;
        if(score>=20)
            System.out.println("Pass");
        else
            System.out.println("Fail");

         */
        /*if-else-if ladder
        int a=28;
        if(a>=30)
            System.out.println("good");
        else if(a>=25)
            System.out.println("ok");
        else if(a>=20)
            System.out.println("not bad");
        else
            System.out.println("bad");
    */

        /* nested if-else
        int age=19;
        char gender='M';

        if(gender =='M')
        {
            System.out.println("Male");
            if(age>18)
            {
                System.out.println("male age<=18");
            }

        }
        else {
            System.out.println("Not male");
            if (age < 18) {
                System.out.println("Not male age<18");
            }
        }

         */
        /*ternary operator

        int streakdays=5;
        String status=(streakdays>30)?"consistency":"Irregular";
        System.out.println(status);

         */

        /*Switch Stmt


        System.out.println("enter the value for day:");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("saturday");


        }

         */
    }
}
