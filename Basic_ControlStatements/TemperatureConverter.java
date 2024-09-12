import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char input;
        float temp, convert;
        System.out.print("Input temperature in Celcius/Fahrenheit(Type C/F): ");
        input= sc.next().charAt(0);

        if(input=='C' || input=='c'){
            System.out.print("Enter temperature in "+ input + " : ");
            temp= sc.nextFloat();
            convert= (temp * 9)/5 + 32;
            System.out.println(temp + "" + input + " = " + convert + "F");
        }
        else if(input=='F' || input=='f'){
            System.out.print("Enter temperature in "+ input + " : ");
            temp= sc.nextFloat();
            convert= (temp-32) * 5/9;
            System.out.println(temp + "" + input + " = " + convert + "C");
        }
        else{
            System.out.println("Invalid temperature type");
        }

    }
}
