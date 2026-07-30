import java.util.Scanner;

public class StringBasics
{
    public static void main(String[] args)
    {
        /*
        String firstName="vishalu";
        String lastName=new String("Poojari");
        System.out.println("my name is "+ firstName + " N " + lastName);


        String name="ramya";
        //name[0]='8';//not possible
        name="bana";
        System.out.println(name);//bana


        String name1="Love";
        String name2="Love";


//comparing the strings

        //1.   ==    ->checks the refering
        if(name1 == name2)// checks name1 and name2 are referring same location or address
        {
            System.out.println("both string are equal");

        }
        else
        {
            System.out.println("both strings are not equal");
        }


        //2  .equals()     ->checks the content  and it is case sensitive
        if(name1.equals(name2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }


        String name3="LOve";
        if(name1.equals(name3))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }



        //3  .equalsIgnoreCase   ->it  checks the content and ignores the case
        if(name1.equalsIgnoreCase(name2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }



        if(name1.equalsIgnoreCase(name3))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }


        Scanner sc=new Scanner(System.in);
        System.out.println("provide string");
        String str1=sc.nextLine();
        System.out.println("Value of next Line "+str1);

        System.out.println("provide string");
        String str2=sc.next();
        System.out.println("Value of next "+str2);



//COMMON STRING METHOD
        String str="Babbar";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        String names="BABBAR";
        System.out.println(str.equals(names));
        System.out.println(str.equalsIgnoreCase(names));


        //empty->length=0
        //blank-> 1.empty or 2.only spaces in string
        String s3="";
        String s4=" ";
        String s5="  babbar  ";
        String s6="ABC";
        String s7="abc";
        System.out.println(s3.length());
        System.out.println(s3.isEmpty());
        System.out.println(s4.isEmpty());
        System.out.println(s3.isBlank());
        System.out.println(s4.isBlank());
        System.out.println(s5.length());
        s5=s5.trim();
        System.out.println(s5.length());
        System.out.println(s6.toLowerCase());
        System.out.println(s7.toUpperCase());
*/

        //chat gpt ex

                //1. length()
                String s1 = "Hello";
                System.out.println("length: " + s1.length());

                //2. charAt()
                System.out.println("charAt: " + s1.charAt(1));

                //3. substring()
                String s2 = "HelloWorld";
                System.out.println("substring: " + s2.substring(0,5));

                //4. contains()
                String s3 = "Java Programming";
                System.out.println("contains: " + s3.contains("Java"));

                //5. equals()
                String a = "Java";
                String b = "Java";
                System.out.println("equals: " + a.equals(b));

                //6. equalsIgnoreCase()
                String c = "JAVA";
                String d = "java";
                System.out.println("equalsIgnoreCase: " + c.equalsIgnoreCase(d));

                //7. toUpperCase()
                String s4 = "java";
                System.out.println("toUpperCase: " + s4.toUpperCase());

                //8. toLowerCase()
                String s5 = "JAVA";
                System.out.println("toLowerCase: " + s5.toLowerCase());

                //9. trim()
                String s6 = "   hello   ";
                System.out.println("trim: " + s6.trim());

                //10. split()
                String s7 = "apple,banana,mango";
                String arr[] = s7.split(",");

                System.out.println("split:");
                for(String val : arr)
                {
                    System.out.println(val);
                }

                //11. startsWith()
                String s8 = "Java Programming";
                System.out.println("startsWith: " + s8.startsWith("Java"));

                //12. endsWith()
                String s9 = "file.pdf";
                System.out.println("endsWith: " + s9.endsWith(".pdf"));

                //13. valueOf()
                int num = 100;
                String str = String.valueOf(num);
                System.out.println("valueOf: " + str);

                //14. toCharArray()
                String s10 = "Java";
                char ch[] = s10.toCharArray();

                System.out.println("toCharArray:");
                for(char x : ch)
                {
                    System.out.println(x);
                }

                //15. isEmpty()
                String s11 = "";
                System.out.println("isEmpty: " + s11.isEmpty());

                //16. isBlank()
                String s12 = "   ";
                System.out.println("isBlank: " + s12.isBlank());

                //17. replace()
                String s13 = "Java";
                System.out.println("replace: " + s13.replace('a','o'));

                //PRACTICE

            //1.Print each character of String
            String str1="love";
            int n=str1.length();
            for(int i=0;i<n;i++)
            {
                char ch1 = str1.charAt(i);
                System.out.println(ch1);
            }


            //2.Count length of string without using Length()

            char[] arr1=str1.toCharArray();
            int len=arr1.length;
            System.out.println(len);

            //3.count vowels in a String
            int count = 0;
            char ch2;

            for(int i = 0; i < str1.length(); i++)
            {
                ch2 = str1.charAt(i);

                if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')
                {
                    count++;
                }

                System.out.print(ch2);
            }

            System.out.println();
            System.out.println("Number of vowels: " + count);


            //4.Reverse String
        String reverse = "";

        int n1 = str1.length();
        char ch1;

        for(int i = n1 - 1; i >= 0; i--)
        {
            ch1 = str1.charAt(i);
            reverse = reverse + ch1;
        }

        System.out.println(reverse);


        //5.check String is a palindrome or not
        //L->R and R->L both have to same its called palindrome
        //ex: NOON NOON, nayana nayana

        //5. check String is palindrome or not

        String str2 = "madam";

        String reverse1 = "";

//reverse the string
        for(int i = str2.length()-1; i >= 0; i--)
        {
            reverse1 = reverse1 + str2.charAt(i);
        }

//check original and reverse string
        if(str2.equals(reverse1))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }












}
}
