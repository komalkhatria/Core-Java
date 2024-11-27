import java.util.*;
class Car{
    int number;
    String name;
    double price;
    Car(int number, String name, double price){
        this.number= number;
        this.name= name;
        this.price= price;
    }
}
public class Custom_LinkedList {
    public static void main(String[] args) {
        Car c1= new Car(4271, "Kia", 800000);
        Car c2= new Car(8976, "Verna", 650000);
        LinkedList<Car> l= new LinkedList<>();
        l.add(c1);
        l.add(c2);

        for(Car c: l) {
            System.out.println(c.number + " " + c.name + " " + c.price);
        }

    }
}
