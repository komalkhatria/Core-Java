import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name, address, bank_name;
        int sal, holidays;
        long ac_no;
        float alot, cut;

        System.out.print("Enter your name: ");
        name= sc.next();
        sc.nextLine();
        System.out.print("Enter your address: ");
        address= sc.nextLine();
        System.out.print("Enter bank name: ");
        bank_name= sc.nextLine();
        System.out.print("Enter your account no: ");
        ac_no= sc.nextLong();
        System.out.print("Enter your monthly salary: ");
        sal= sc.nextInt();
        System.out.print("Enter no of offs you took: ");
        holidays= sc.nextInt();

        if(holidays<=1){
            cut=0;
        }
        else if(holidays>=2 && holidays<=5){
            cut= 0.05f * sal;
        }
        else if(holidays>=6 && holidays<=14){
            cut= 0.10f * sal;
        }
        else if(holidays==15){
            cut= 0.50f * sal;
        }
        else{
            cut =sal;
        }
        alot= sal-cut;

        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Bank details: \n" + " Bank name: " + bank_name + " Account number: " + ac_no);
        System.out.println("Salary: " + sal);
        System.out.println("Holidays: " + holidays);
        System.out.println("Salary alloted: " + alot);

    }
}
