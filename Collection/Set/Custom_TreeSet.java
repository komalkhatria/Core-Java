import java.util.*;
import java.lang.*;
class Student implements Comparable<Student>{
    int roll_no;
    String name, stream;
    double percentage;
    Student(int roll_no, String name, String stream, double percentage){
        this.roll_no= roll_no;
        this.name= name;
        this.stream= stream;
        this.percentage= percentage;
    }
    public int compareTo(Student other) {
        return Integer.compare(this.roll_no, other.roll_no); // Compare by roll_no
    }
}
public class Custom_TreeSet {
    public static void main(String[] args) {
        TreeSet<Student> set= new TreeSet<>();
        Student s1= new Student(15, "Piyush", "Commerce", 84.5);
        Student s2= new Student(12, "Jeeva", "Humanities", 92.4);
        Student s3= new Student(13, "Maanav", "Science", 73.8);

        set.add(s1);
        set.add(s2);
        set.add(s3);

        for(Student s: set){
            System.out.println(s.roll_no+ " " + s.name+ " " + s.stream+ " " + s.percentage);
        }
    }
}