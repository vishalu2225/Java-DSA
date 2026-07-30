public class Student1 implements Comparable<Student1>
{
    public int age;
    public String name;
    public int weight;

    public Student1(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Student1 that)
    {
        //this method is called for current object
        //we will define our sorting logic here


        //if we have same age it have sort in the basic of name as alphabetic order
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        //sort basis of age(ascending order)
        //this.age > that.age=+ve integer
        //this.age < that.age=-ve integer
        //this.age = that.age=0 integer
        return this.age-that.age;//ascending
        //return that.age-this.age;descending




    }

}
