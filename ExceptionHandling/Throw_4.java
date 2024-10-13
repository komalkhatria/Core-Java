//EXCEPTION IS THE SUB CLASS OF THROWABLE AND THE USER-DEFINED EXCEPTIONS USUALLY EXTEND THE EXCEPTION CLASS
public class Throw_4 extends Exception{

    //FOR USER-DEFINED EXCEPTIONS, WE USE CONSTRUCTOR TO PRINT THE EXCEPTION MESSAGE
    public Throw_4(String name){
        super(name);        //CALLING THE SUPER CLASS CONSTRUCTOR TO SET THE MESSAGE
    }

    public static void main(String[] args) {

        /* Throw_4 IS A CHECKED EXCEPTION WHICH MUST BE HANDLED BY:
        i)Using try-catch block, or
        ii)Declaring the exception using throws keyword in the method signature */

        try{
            //THROWING A NEW INSTANCE OF THE CUSTOM EXCEPTION Throw_4
            throw new Throw_4("Exception thrown");
        }
        catch(Throw_4 ex){
            //CATCHING AND PRINTING EXCEPTION MESSAGE
            System.out.println(ex.getMessage());
        }
    }
}



/*public class Throw_4 {
    public static void main(String[] args) {

        //TO THROW AN EXCEPTION, THE INSTANCE MUST BE OF TYPE THROWABLE OR SUBCLASS OF THROWABLE
        throw new Throw_4();        //CANNOT THROW ANY EXCEPTION
    }
}*/
