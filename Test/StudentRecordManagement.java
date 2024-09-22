import java.util.Scanner;
class Student{
    String name;
    int age, marks;
    void setValues(String name, int age, int marks){
        this.name=name;
        this.age= age;
        this.marks=marks;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int getMarks(){
        return marks;
    }
}

public class StudentRecordManagement{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Student s1= new Student();
        System.out.print("Enter number of students: ");
        int num= sc.nextInt();
        System.out.print("Input the name, age, and marks: ");
        String name= sc.next();
        int age= sc.nextInt();
        int marks= sc.nextInt();
        s1.setValues(name, age, marks);
        System.out.println("Name: " + s1.getName() + ", Age: " + s1.getAge() + ", Marks: " + s1.getMarks());
        System.out.println();

    }
}
