import java.util.Comparator;

public class WeightComparator implements Comparator<Student1>
{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        //if basis of weight
        //return o1.weight - o2.weight;

        //OR
        return Integer.compare(o1.weight,o2.weight);
    }
}
