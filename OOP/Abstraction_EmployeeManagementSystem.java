abstract class Employee{
    String name, designation;
    int employeeID;

    Employee(String name, int employeeID, String designation) {
        this.name = name;
        this.employeeID = employeeID;
        this.designation = designation;
    }
    abstract double calculateSalary();
    abstract void getEmployeeDetails();
    void showBasicInfo(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

interface Workable{
    void performDuties();
}
class FullTimeEmployee extends Employee implements Workable{
    double basicSalary, allowance;

    FullTimeEmployee(String name, int employeeID, String designation, double basicSalary, double allowance) {
        super(name, employeeID, designation);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }
    @Override
    double calculateSalary() {
        return basicSalary + allowance;
    }

    @Override
    void getEmployeeDetails() {
        showBasicInfo();
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowances: " + allowance);
        System.out.println("Total Salary: " + calculateSalary());
        performDuties();
        System.out.println();
    }
    public void performDuties(){
        System.out.println("Performing full-time duties...");
    }
}
class PartTimeEmployee extends Employee implements Workable{
    double hourlyRate, hoursWorked;

    PartTimeEmployee(String name, int employeeID, String designation, double hourlyRate, double hoursWorked){
        super(name, employeeID, designation);
        this.hourlyRate= hourlyRate;
        this.hoursWorked= hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void getEmployeeDetails() {
        showBasicInfo();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
        performDuties();
        System.out.println();
    }
    public void performDuties(){
        System.out.println("Performing part-time duties...");
    }
}
public class Abstraction_EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fTemp= new FullTimeEmployee("Nick", 122, "Team Lead", 36500, 2800);
        PartTimeEmployee pTemp= new PartTimeEmployee("Softie", 134, "Developer", 350, 110);
        fTemp.getEmployeeDetails();
        pTemp.getEmployeeDetails();
    }
}
