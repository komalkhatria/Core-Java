import java.util.Scanner;
public class PercentageGradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5;
        float total_marks, percent;
        char grade;
        System.out.println("Enter marks of the respective subjects: ");
        System.out.print("English: ");
        m1= sc.nextInt();
        System.out.print("Math: ");
        m2= sc.nextInt();
        System.out.print("Physics: ");
        m3= sc.nextInt();
        System.out.print("Chemistry: ");
        m4= sc.nextInt();
        System.out.print("Computer: ");
        m5= sc.nextInt();

        total_marks= m1+ m2+ m3+ m4+ m5;
        System.out.println("Total marks= " + total_marks);
        percent= (total_marks/500)*100;
        System.out.println("Percentage= " + percent);

        if(percent<25){
            grade= 'F';
        }
        else if(percent>=25 && percent<45){
            grade= 'E';
        }
        else if(percent>=45 && percent<50){
            grade= 'D';
        }
        else if(percent>=50 && percent<60){
            grade= 'C';
        }
        else if(percent>=60 && percent<80){
            grade= 'B';
        }
        else{
            grade= 'A';
        }
        System.out.println("Grade= " + grade);

    }
}
