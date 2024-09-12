import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float height, weight, bmi;
        System.out.print("Enter your height (in meter): ");
        height= sc.nextFloat();
        System.out.print("Enter your weight (in kg): ");
        weight= sc.nextFloat();
        bmi= weight/(height*height);
        System.out.println("BMI = " + bmi);

        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if(bmi>18.5 && bmi<24.9){
            System.out.println("Normal weight");
        }
        else if(bmi>=25 && bmi<29.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("obesity");
        }

    }
}
