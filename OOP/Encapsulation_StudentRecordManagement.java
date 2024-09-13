import java.util.Scanner;
class Student{
    //private ATTRIBUTES OF Student CLASS
    private String name;
    private int age, marks;

    //SETTER METHOD
    void setDetails(String name, int age, int marks){
        this.name=name;
        this.age= age;
        this.marks= marks;
    }

    //GETTER METHODS
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
public class Encapsulation_StudentRecordManagement {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        Student s= new Student();

        //USER INPUT NO. OF STUDENTS
        System.out.print("Enter number of students: ");
        int students= read.nextInt();
        int roll_no=0;

        //INSERT AND RETRIEVE RECORDS OF ALL STUDENTS ONE BY ONE
        while(students>0){
            String name;
            int age, marks;
            roll_no+=1;

            System.out.println("\nEnter details of student " + roll_no + ": ");
            System.out.print("Name: ");
            read.nextLine();
            name= read.nextLine();
            System.out.print("Age: ");
            age= read.nextInt();
            System.out.print("Marks: ");
            marks= read.nextInt();

            //DISPLAYING STUDENT INFORMATION RIGHT AWAY
            System.out.println("\nStudent no. " + roll_no + ": ");
            s.setDetails(name, age, marks);
            System.out.println("Name: " + s.getName() + ", Age: " + s.getAge() + ", Marks: " + s.getMarks());

            students--;
        }

    }
}