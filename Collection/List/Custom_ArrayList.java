import java.util.*;
class Student{
    int id;
    String name;
    char grade;
    Student(int id, String name, char grade){
        this.id= id;
        this.name= name;
        this.grade= grade;
    }
}
public class Custom_ArrayList {
    public static void main(String[] args) {
        Student s1= new Student(101, "Softie", 'A');
        Student s2= new Student(102, "Shaurya", 'B');
        ArrayList<Student> al= new ArrayList<>();
        al.add(s1);
        al.add(s2);

        for(Student s: al){
            System.out.println(s.id + " " + s.name + " " + s.grade);
        }
    }
}
