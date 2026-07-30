import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import java.util.Set;

public class SetEx
{
    public static void main(String[] args) {

        //1. HashSet

        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();

        st1.add(10);
        st1.add(20);
        st1.add(30);
        st1.add(40);

        st2.add(30);
        st2.add(40);
        st2.add(50);
        st2.add(60);

        System.out.println(st1);//[20, 40, 10, 30]
        st1.retainAll(st2);//common element will store
        System.out.println(st1);//[40, 30]

        System.out.println(st1.containsAll(st2));//false
        System.out.println(st2.containsAll(st1));//true

        //2.LinkedhashSet
        Set<Integer> st = new LinkedHashSet<>();

        st.add(40);
        st.add(20);
        st.add(30);
        st.add(10);
        st.add(10);// Duplicate, will not be added

        System.out.println(st);//it will follow order


        //3.TreeSet
        Set<Integer> stt = new TreeSet<>();

        stt.add(10);
        stt.add(20);
        stt.add(30);
        stt.add(10); // Duplicate, will not be added

        System.out.println(stt);//it will display by sorted order



        //hash set for custom class/object of student
        HashSet<Student>set=new HashSet<>();

        Student s1=new Student(101,"anu");
        Student s2=new Student(101,"anu");
        Student s3=new Student(101,"anu");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);


    }

}