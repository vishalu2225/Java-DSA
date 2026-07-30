public class Pattern {
    public static void main(String[] args) {
       /*SOLID SQUARE PATTERN
       EXAMPLE1
        int n=4;
        for(int row=1;row<=n;row++)
        {
            //FOR EACH ROW->N COLUMN
            for(int col=1;col<=n;col++)
            {
                //PRINT STAR
                System.out.print("* ");
            }
            System.out.println();
        }
    }

        example2
        int n = 3;
        for (int row = 1; row <= n; row++) {
            //FOR EACH ROW->5 COLUMN
            for (int col = 1; col <= 5; col++) {
                //PRINT STAR
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
/*Right Angle triangle
    int n = 5;
    for(int row = 1;row<=n;row++)
    {
        for(int col=1;col<=row;col++) {
            System.out.print("* ");
        }
        System.out.println();
    }*/
        //solid rhombus pattern
    /*int n=5;
    for(int row=1;row<=n;row++)
    {
        //for each row->space,row
        //spaces
        for(int col=1;col<=n-row;col++)
        {
            System.out.print(" ");
        }
        for(int col=1;col<=n;col++)
        {
            System.out.print("* ");

        }
        System.out.println();
    }*/
/*inverted right triangle Pattern
        int n=5;
        for(int row=1;row<=n;row++)
        {
            //row for each row->variable column
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("* ");

            }
            System.out.println();


        }

 */

        /*int n=4;
        for(int row=1;row<=n;row++)
        {
            //row for each row->variable column
            //spaces
            for(int col=1;col<=row-1;col++)
            {
                System.out.print(" ");

            }
            //star
            for(int col=1;col<=2*n-2*row+1;col++)
            {
                System.out.print("*");

            }
            //move to next column
            System.out.println();


        }*/
        /*int n=4;
        for(int row=1; row<=n; row++)
        {

            for(int col=1; col<=6; col++)
            {

                if(row==1 || row==n)
                {
                    System.out.print("* ");
                }
                else
                {

                    if(col==1 || col==6)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }

            // move to next row
            System.out.println();



        }

         */
       /* int n=10;
        for(int row=1;row<=n;row++)
        {
            //for each row->variable column
            if(row==1 || row==2 || row==n)
            {
                for(int col=1;col<=row;col++)
                {
                    System.out.print("* ");
                }

            }
            else
            {
                //middle rows

                //1*
                System.out.print("* ");
                //(row-2)spaces
                for(int col=1;col<=row-2;col++)
                {
                    System.out.print("  ");
                }

                //1*
                System.out.print("* ");


            }
            //move to next move
            System.out.println("  ");


        int n = 5;

        for(int row = 1; row <= n; row++) {

            // part 1 -> spaces
            for(int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // part 2 -> stars
            if(row == 1 || row == n) {

                for(int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("*");
                }

            } else {

                // first star
                System.out.print("*");

                // middle spaces
                for(int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print(" ");
                }

                // last star
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
        */
        /*int n=5;
        for(int row=1;row<=n;row++) {
            //for each row->variable col
            //part 1
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            //part 2
            if (row == 1 || row == n) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("*");
                }
            } else {
                //middle rows
                //1*
                System.out.print("*");
                //2r-3
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print(" ");
                }
                //1*
                System.out.print("*");
            }

            System.out.println();


        }

         */
/*int n=4;
for (int row=1;row<=n;row++)
{
    for( int col=1;col<=n-row;col++)
    {
        System.out.print("  ");
    }
    for(int col=1;col<=2*row-1;col++)
    {
        System.out.print("* ");

    }
    System.out.println();
}
for(int row=1;row<=n;row++)
{
    if(row ==1)
    {
        continue;
    }
    for(int col=1;col<=row-1;col++)
    {
        System.out.print("  ");
    }
    for(int col=1;col<=2*n-2*row+1;col++)
    {
        System.out.print("* ");

    }
    System.out.println();
}



 */
        /*
        //part1
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");

            }
            if (row == 1) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }


            }


            System.out.println("  ");

        }

//Part2
        for (int row = 1; row <= (n - 1); row++)
        {
            //for each row ->variable column

            //part1(spaces)
            for (int col = 1; col <= row; col++)
            {
                System.out.print("  ");

            }


            //part 2
            if (row == (n - 1)) {
                System.out.print("* ");

            } else {
                //1*
                System.out.print("* ");
                //(2(n-r)-3)spaces
                for (int col = 1; col <= 2 * (n - row) - 3; col++) {

                    System.out.print("  ");
                }
                //1*
                System.out.print(" *");

            }
            //move to next row
            System.out.println();
        }

         */

/*
        int n=4;
//part I
        for(int row=1;row<=n;row++) {

            //part 1 star
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");

            }
            //part 2 spaces
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }
            //part 3 star
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for(int row=1;row<=n;row++) {
        //part II
            //part 4 star
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("* ");
            }

            //part 5  spaces
            for(int col=1;col<=(row-1)*2;col++)
            {
                System.out.print("  ");
            }

            //part 6 star
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }



 */






        /*
        //numerical pattern
        int n=5;

        for(int row=1;row<=n;row++) {


            for (int col = 1; col <= row; col++) {
                System.out.print( col+" " );
            }
            System.out.println();
        }*/
        /*
        int n=5;
        int count=1;

        for(int row=1;row<=n;row++) {

            //for each row->variable col
            for (int col = 1; col <= row; col++) {
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
        */


        /*int n=5;

        for(int row=1;row<=n;row++) {

            //for each row->variable col
            for (int col = 1; col <= row; col++) {
                int a = col;
                int b = ('A' - 1);
                int ans = a + b;
                char finalans = (char) ans;

                System.out.print(finalans + " ");
            }
            System.out.println();
        }


         */

/*int n=5;
        for(int row=1;row<=n;row++) {

            //for each row->variable col
            for (int col = 1; col <= row; col++) {
                int  a=n-col;
                int b='A';
                int ans=a+b;
                char finalans=(char)ans;
                System.out.print(finalans + " ");
            }
            System.out.println();
        }



 */

        /*
        int n=4;
        for(int row=1;row<=n;row++)
        {
            //for each row->variable col
            //part1
                for(int col=1;col<=n-row;col++)
                {
                    System.out.print("  ");

                }
                //part2
            for (int col = 1; col <= row; col++)
            {
                System.out.print( col+" " );
            }
            //part3
            int rowValue=row;
            int decRowValue=row-1;
            for(int col=1;col<=row-1;col++){
                System.out.print(decRowValue+" ");
                decRowValue--;
            }


            System.out.println();

            }



         */


        /*
        int n=4;
        for(int row=1;row<=n;row++) {
            //for each row->variable col
            //part1
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");

            }
            //part2
            for(int col=1;col<=2*row-1;col++)
            {
                System.out.print(row+" ");
            }


            System.out.println();
        }

         */

        int n=4;
        for(int row=1;row<=n;row++) {
            //for each row->variable col
            //part1
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");

            }
            //part 2
            for (int col = 1; col <= row; col++)
            {
                int a=col;
                int b='A'-1;
                int ans=a+b;
                char finalans=(char)ans;


                System.out.print(finalans+" " );
            }
            //part 3
            char toPrint=(char)(row+'A'-2);
            for(int col=1;col<=row-1;col++)
            {

                System.out.print(toPrint+" ");
                toPrint--;
            }



            System.out.println();
        }

    }
}

