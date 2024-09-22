import java.util.Scanner;
abstract class Shape{
    Scanner sc= new Scanner(System.in);
    abstract void calculateArea();
}
class Circle extends Shape{
    void calculateArea(){
        System.out.println("Circle: ");
        System.out.print("Enter radius: ");
        int r= sc.nextInt();
        float area= 3.14f * r * r;
        System.out.println("Area of circle= " + area);
    }
}
class Rectangle extends Shape{
    void calculateArea(){
        System.out.println("Rectangle: ");
        System.out.print("Enter length: ");
        int l= sc.nextInt();
        System.out.print("Enter breadth: ");
        int b= sc.nextInt();
        int area= l * b;
        System.out.println("Area of rectangle= " + area);
    }
}
public class ShapesArea_Abstraction{
    public static void main(String args[]){
        Circle c= new Circle();
        c.calculateArea();
        Rectangle r= new Rectangle();
        r.calculateArea();

    }
}
