public class Throw_2 {

    //DECLARING AND INITIALISING A STATIC INSTANCE/OBJECT OF ArithmeticException CLASS WITH DEFAULT CONSTRUCTOR
    static ArithmeticException ex= new ArithmeticException();
    public static void main(String[] args) {

        //THROWING THE ArithmeticException 'ex' EXPLICITLY
        throw ex;       //THE PROGRAM WILL TERMINATE AFTER THROWING EXCEPTION, throw ACT AS return STATEMENT
    }
}
