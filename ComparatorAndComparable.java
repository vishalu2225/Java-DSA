import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class ComparatorAndComparable {

    public static void main(String[] args) {

        List<Student1> student = new ArrayList<>();

        student.add(new Student1(19, "Anu", 68));
        student.add(new Student1(20, "Rahul", 85));
        student.add(new Student1(18, "Priya", 75));
        student.add(new Student1(19, "bnu", 68));


        System.out.println(student);//[Student1{age=19, name='Anu', weight=68}, Student1{age=20, name='Rahul', weight=85}, Student1{age=18, name='Priya', weight=75}]

        //Collections.sort(student); OR

/*
        //by this method we dont need to specify a comparablr interface ,no need to implement inside class to implemwnt to compareTo method
        Collections.sort(student, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                //if basis of weight
                return o1.weight-o2.weight;//[Student1{age=19, name='Anu', weight=68}, Student1{age=19, name='bnu', weight=68}, Student1{age=18, name='Priya', weight=75}, Student1{age=20, name='Rahul', weight=85}]


                //return 0;


            }
        });
        */

        //OR

        //lambda expression
        Collections.sort(student,(o1,o2)->o1.weight-o2.weight);//[Student1{age=19, name='Anu', weight=68}, Student1{age=19, name='bnu', weight=68}, Student1{age=18, name='Priya', weight=75}, Student1{age=20, name='Rahul', weight=85}]


        //OR

    //new comparator operator defined xtra method
   //Collections.sort(student,new WeightComparator());//[Student1{age=19, name='Anu', weight=68}, Student1{age=19, name='bnu', weight=68}, Student1{age=18, name='Priya', weight=75}, Student1{age=20, name='Rahul', weight=85}]


        //OR
        //comparing
        //thecomparing

        System.out.println(student);//[Student1{age=18, name='Priya', weight=75}, Student1{age=19, name='Anu', weight=68}, Student1{age=20, name='Rahul', weight=85}]

      //Arrays.sort(array,comparator)

        //ascending order
        int[] arr={3,1,7,2,8,4};


        java.util.Arrays.sort(arr);

        for(int a:arr) {

            System.out.print(a + " ");//1 2 3 4 7 8
            //System.out.println(a); //1
            //2
            //3
            //4
            //7
            //8
        }
        System.out.println();

        //descending order
            Integer[] arr1 = {3, 1, 7, 2, 8, 4};

            java.util.Arrays.sort(arr1,new ReverseCmp());
            for(int a1:arr1) {

                System.out.print(a1 + " ");//8 7 4 3 2 1
            }








    }
}