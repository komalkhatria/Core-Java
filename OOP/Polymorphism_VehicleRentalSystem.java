import java.util.Scanner;
class Vehicle{
    String title;
    Vehicle(String title){
        this.title=title;
    }

    double calculateRentalCost(int days){
        return 0;
    }
    String getVehicleType(){
        return "Vehicle";
    }

    void displayRentalDetails(int days){
        System.out.println("Vehicle type: " + getVehicleType());
        System.out.println("Title: " + title);
        System.out.println("Rental cost for " + days + " days= " + calculateRentalCost(days));
        System.out.println();
    }
}
class Car extends Vehicle{
    final double rentalCostPerDay=1000;
    Car(String title){
        super(title);
    }
    double calculateRentalCost(int days){
        return days* rentalCostPerDay;
    }
    String getVehicleType(){
        super.getVehicleType();
        return "Car";
    }
}
class Bike extends Vehicle{
    Bike(String title){
        super(title);
    }
    final double rentalCostPerDay=500;
    double calculateRentalCost(int days){
        return days* rentalCostPerDay;
    }
    String getVehicleType(){
        return "Bike";
    }
}

class Truck extends Vehicle{
    Truck(String title){
        super(title);
    }
    final double rentalCostPerDay=1500;
    double calculateRentalCost(int days){
        return days* rentalCostPerDay;
    }
    String getVehicleType(){
        return "Truck";
    }
}

class RentalSystem{
    void rentVehicle(Vehicle vehicle, int days){
        vehicle.displayRentalDetails(days);
    }
}
public class Polymorphism_VehicleRentalSystem {
    public static void main(String[] args) {
        RentalSystem rent= new RentalSystem();
        Vehicle car= new Car("Honda");
        Vehicle bike= new Bike("Yamaha");
        Vehicle truck= new Truck("Tata");
        rent.rentVehicle(car, 5);
        rent.rentVehicle(bike, 2);
        rent.rentVehicle(truck, 3);

    }
}