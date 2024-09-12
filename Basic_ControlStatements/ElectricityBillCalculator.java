import java.util.Scanner;
public class ElectricityBillCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name;
        int unit, bill;
        float discount, total;

        System.out.print("Enter your name: ");
        name= sc.next();
        System.out.print("Enter units of electricity consumed: ");
        unit= sc.nextInt();

        bill= unit * 10;

        if(unit>=1 && unit<=10){
            discount= 0.10f * bill;
        }
        else if(unit>=11 && unit<=20){
            discount= 0.15f * bill;
        }
        else if(unit>=21 && unit<=50){
            discount= 0.30f * bill;
        }
        else if(unit>50){
            discount= 0.50f * bill;
        }
        else{
            discount =0;
        }

        total= bill- discount;

        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Units consumed: " + unit);
        System.out.println("Bill: " + bill);
        System.out.println("Discount: " + discount);
        System.out.println("Total Amount Payable: " + total);


    }
}

