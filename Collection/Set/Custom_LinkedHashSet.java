import java.util.*;
class Employee{
    int id;
    String name, department;
    double salary;
    Employee(int id, String name, String department, double salary){
        this.id= id;
        this.name= name;
        this.department= department;
        this.salary= salary;
    }
}
public class Custom_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Employee> set= new LinkedHashSet<>();
        Employee e1= new Employee(101, "Arun", "Sales", 35000);
        Employee e2= new Employee(105, "Vanya", "HR", 22000);
        Employee e3= new Employee(107, "Piyush", "Product", 58000);

        set.add(e1);
        set.add(e2);
        set.add(e3);

        for(Employee e: set){
            System.out.println(e.id+ " " + e.name+ " " + e.department+ " " + e.salary);
        }
    }
}
