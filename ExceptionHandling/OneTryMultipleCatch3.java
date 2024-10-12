public class OneTryMultipleCatch3 {
    public static void main(String[] args) {

        //CONTAINS CODE WHERE EXCEPTION MAY OCCUR
        try{
            int a[]= new int[5];
            a[7]=9/0;
            System.out.println(a[7]);
        }
        /*In this try block two exceptions are found.
        But firstmost assigning a value that is a division by zero is wrong and an arithmetic exception will occur rightaway.
        Therefore the catch block that is handling the arithmetic exception will be executed because the data is read from right to left.
         */

        //HANDLING ARRAY INDEX OUT OF BOUNDS EXCEPTION
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }

        //HANDLING ARITHMETIC EXCEPTION
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
    }
}
