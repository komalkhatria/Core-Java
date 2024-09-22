import java.util.Scanner;
interface Payable{
    Scanner read= new Scanner(System.in);
    void getPaymentAmount();
}
class SalariedEmployee implements Payable{
    String name;
    int monthlySalary;
    public void getPaymentAmount(){
        System.out.print("Enter employee name: ");
        name= read.next();
        System.out.print("Enter monthly salary: ");
        monthlySalary= read.nextInt();
        System.out.println("Name: " + name + " (Salaried employee)");
        System.out.println("Monthly salary: " + monthlySalary);
        System.out.println();
    }
}
class HourlyEmployee implements Payable{
    String name;
    float hoursWorked;
    int hourlyRate= 200;
    public void getPaymentAmount(){
        System.out.print("Enter employee name: ");
        name= read.next();
        System.out.print("Enter hours worked per month: ");
        hoursWorked= read.nextFloat();
        System.out.println("Name: " + name + " (Hourly employee)");
        System.out.println("Monthly salary: " + (hoursWorked * hourlyRate));
        System.out.println();
    }
}
public class EmployeeSalaryCalculator{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        SalariedEmployee se= new SalariedEmployee();
        HourlyEmployee he= new HourlyEmployee();
        System.out.print("Enter number of employees: ");
        int emp_no= sc.nextInt();
        while(emp_no>=0){
            System.out.print("Input type of employee(Salaried/Hourly): ");
            String emp_type= sc.next();
            if(emp_type.equals("Salaried") || emp_type.equals("salaried")){
                se.getPaymentAmount();
            }
            else if(emp_type.equals("Hourly") || emp_type.equals("hourly")){
                he.getPaymentAmount();
            }
            else{
                System.out.println("Invalid employee type");
            }
            emp_no--;
        }

    }
}
