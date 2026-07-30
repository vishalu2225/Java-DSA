import static java.lang.Math.sqrt;

public class BasicMaths {

    static void printDigits(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    static int countDigits(int num) {
        int count = 0;

        while (num != 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    static int sumDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        return sum;
    }

    static int reverseNum(int num) {
        int revNum = 0;

        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }

        return revNum;
    }

    static int reverseDigits(int num) {
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = reverseNum(num);

        if (originalNum == reversedNum) {
            System.out.println("It is a palindrome");
            return true;
        } else {
            System.out.println("It is not a palindrome");
            return false;
        }
    }
    //Prime or not
    static boolean isPrimmeNot(int num) {
        //or
        // for (int i = 2; i <= num - 1; i++)
        //or
        // for (int i = 2; i*i<= num - 1; i++)
        //or
        for (int i = 2; sqrt(i) <= num - 1; i++){
            if (num % i == 0) {
                //not a prime
                return false;
            }
        }
        //yaha tabh pohochoge ,jab loop se bahar nikloge or loop se tabhi bahar nikloge,jab bhi remainder me na zero naa aaye
        //or agar kabho remainder 0 nahi aaya iska matlab it s prime no
        return true;
    }
//gcd
    static  int getGCD(int a,int b)
    {
        //gcd(a,b),=gcd(b,a%b)
        while(b!=0)
        {
            int oldvalueofB=b;
            b=a%b;
            a=oldvalueofB;
        }
        //jab mera b 0 hoga ,tab a ki place par gcd milega
        int ans=a;
        return ans;
    }
//LCM
    static int getLCM(int a,int b)
    {
        int gcd=getGCD(a,b);
        //gcd(18,12)=6
        int prod=a*b;
        //prob(a,b)->216
        int lcm=prod/gcd;
        //216/6
        return lcm;
    }
    //ArmstrongNumber
    static boolean isArmstrongNumber(int num)
    {
        int sum=0;
        int originalNum=num;
        while(num!=0)
        {
           int digit= num%10;
            int cubeDigit=digit*digit*digit;
            sum=sum+cubeDigit;
            //digit remove from num
            num=num/10;
        }
        if(sum == originalNum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //checkPerfectNumber
    static boolean checkPerfectNumber(int num)
    {
        int sum=1;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                //i ne num ko perfectly divide kardia h
                //1st factor i
                //2nd factor->num/i
                int firstFactor = i;
                int secondFactor=num/i;
                sum=sum+firstFactor+secondFactor;
            }
        }

        if ( sum == num)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    //print all prime no from 1 to N
    //static boolean printAllPrimes(int n) {
        //print all prime no from 1 to N
        //1 is not a prime number
        /*for (int num = 2; num <= n; num++) {
            boolean isPrime = isPrimmeNot(num);
            if (isPrime == true) {
                System.out.println(num);
            }

        }
    }
        //check whether a no is prime or not

        int num = 5;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
*/
    public static void main(String[] args){

        int ans4=getGCD(18,12);
        System.out.println("gcd:"+ans4);

        int ans5=getLCM(18,12);
        System.out.println("lcm:"+ans5);

        boolean ans2 = isPalindrome(1221);
        System.out.println(ans2);

        boolean ans3=isPrimmeNot(15);
        System.out.println(ans3);

        int num = 53127;

        System.out.println("Digits:");
        printDigits(num);

        int count = countDigits(num);
        System.out.println("Total digits: " + count);

        int sum = sumDigits(12345);
        System.out.println("Sum of digits: " + sum);

        int rev = reverseDigits(12345);
        System.out.println("Reverse number: " + rev);

        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(155));

        System.out.println(checkPerfectNumber(6));
        System.out.println(checkPerfectNumber(7));


        // System.out.println(printAllPrimes(num));
       // System.out.println(printAllPrimes(10));
        //System.out.println(printAllPrimes(6));
    }

}