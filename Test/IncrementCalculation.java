import java.util.Scanner;
public class IncrementCalculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the salary: ");
        int salary= sc.nextInt();
        System.out.print("Enter the performance appraisal rating: ");
        float rating= sc.nextFloat();
        float appraisal= 0;

        if(salary<=0 || rating<1 || rating>5){
            System.out.println("Invalid Input");
        }
        else{
            if(rating>=1 && rating<=3){
                appraisal= salary*0.10f;
            }
            else if(rating>=3.1 && rating<=4){
                appraisal= salary*0.25f;
            }
            else if(rating>=4.1 && rating<5){
                appraisal= salary*0.30f;
            }
            System.out.println("Incremented salary= " + (salary+appraisal));
        }

    }
}