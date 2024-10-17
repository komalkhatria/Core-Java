// throws keyword is used to declare an exception
// It gives information to the programmer that there may occur an exception
// throws is always used with method
// Two or more exceptions can be declared together in a method using throws keyword

public class Throws {
    //DECLARE show() METHOD THAT CAN THROW ArithmeticException OR NullPointerException
    static void show() throws ArithmeticException, NullPointerException{
        System.out.println("Show");
    }
    public static void main(String[] args) {
        show();
    }
}

/*public class Throws extends RuntimeException{
    static void show() throws Throws{
        System.out.println("Throwing custom class as exception");
    }
    public static void main(String[] args) {
        show();
    }
}*/
