// throws keyword is used to declare an exception
// It gives information to the programmer that there may occur an exception
// throws is always used with method

public class Throws {
    //DECLARE show() METHOD THAT CAN THROW AN ArithmeticException
    static void show() throws ArithmeticException{
        System.out.println("Show");
    }
    public static void main(String[] args) {
        show();
    }
}
