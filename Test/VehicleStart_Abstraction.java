abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car start");
    }
}
class Bicycle extends Vehicle{
    void start(){
        System.out.println("Bicycle start");
    }
}
class Boat extends Vehicle{
    void start(){
        System.out.println("Boat start");
    }
}
public class VehicleStart_Abstraction{
    public static void main(String args[]){
        Car c= new Car();
        c.start();
        Bicycle by= new Bicycle();
        by.start();
        Boat b= new Boat();
        b.start();

    }
}

