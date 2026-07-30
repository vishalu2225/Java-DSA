import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList
{
    public static  void main(String[] args)
    {


        //I.ArrayList
        //list or collection->interface

        //arraylist->concrete class
        java.util.ArrayList<Integer> list=new java.util.ArrayList<>();
        //List <Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        //addAll
        List <Integer>list1=new java.util.ArrayList<>();
        list1.add(101);
        list1.add(102);
        list1.add(103);

        list.addAll(list1);
        System.out.println(list);

        list.removeAll(list1);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("list1"+list1);
        list1.clear();
        System.out.println(list1.size());

        //i want to traverse list using iterator
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext())
        {
            System.out.println("element "+iterator.next());
        }
        List<Integer>list2=new java.util.ArrayList<>();
        list2.add(11);
        list2.add(10);
        list2.add(31);
        System.out.println(list2.get(0));
        System.out.println("before:"+list2);
        list2.set(0,100);
        System.out.println("after"+list2);

        //toArray(convert to array)
       Object[] arr= list2.toArray();
       for(Object obj:arr)
       {
           System.out.println(obj);
       }
        //contains
        System.out.println(list2.contains(100));
        System.out.println(list2.contains(1000));


        list.add(5);
        list.add(2);
        System.out.println("Printing entier list :"+list);

        //sort an arraylist
        Collections.sort(list);
        System.out.println("Printing entier list after soting :"+list);


        //clone
        java.util.ArrayList<Integer> newlist=(java.util.ArrayList<Integer>)list.clone();
        System.out.println(newlist);

        //ensure capacity
        java.util.ArrayList<Integer> marks=(java.util.ArrayList<Integer>)list.clone();
        marks.ensureCapacity(100);

        System.out.println(newlist.isEmpty());//false bcs its empty

        //indexOf
        System.out.println(list.indexOf(20));


        //Collection <Integer>colection=new ArrayList<>();


    }
}
