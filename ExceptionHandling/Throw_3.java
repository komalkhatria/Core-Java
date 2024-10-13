public class Throw_3 {

    //DECLARING AN OBJECT OF ArithmeticException CLASS, BUT NOT INITIALISING IT
    static ArithmeticException ex;      //BY DEFAULT ITS VALUE IS NULL
    public static void main(String[] args) {

        //ATTEMPTING TO THROW THE EXCEPTION OBJECT
        throw ex;       //THIS WILL THROW NullPointerException INSTEAD OF ARITHMETIC EXCEPTION AS THE OBJECT 'ex' IS NULL
    }
}
