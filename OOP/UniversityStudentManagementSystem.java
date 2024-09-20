class UniversityStudent{
    String studentName;
    int studentId;
    String department;
    char grade;
    static String universityName;
    static int totalStudents;
    UniversityStudent(String studentName, int studentId, String department, char grade){
        this.studentName= studentName;
        this.studentId= studentId;
        this.department= department;
        this.grade= grade;
        totalStudents++;
    }
    static void setUniversityName(String name){

        universityName= name;
    }
    static int getTotalStudents(){
        System.out.print("Total students: ");
        return totalStudents;
    }

    void displayStudentDetails(){
        System.out.println("University name: " + universityName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student name: " + studentName);
        System.out.println("Department: " + department);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class UniversityStudentManagementSystem {
    public static void main(String[] args) {
        UniversityStudent.setUniversityName("Rajasthan University");

        UniversityStudent student1= new UniversityStudent("Ravi", 1408, "Commerce", 'B');
        student1.displayStudentDetails();

        UniversityStudent student2= new UniversityStudent("Shagun", 1087, "Arts", 'A');
        student2.displayStudentDetails();

        UniversityStudent student3= new UniversityStudent("Manitraj", 1294, "Science", 'A');
        student3.displayStudentDetails();

        System.out.println(UniversityStudent.getTotalStudents());
    }
}
