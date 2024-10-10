public class OneTryMultipleCatch2 {
    public static void main(String[] args) {

        //CONTAINS CODE WHERE EXCEPTION MAY OCCUR
        try{
            String name=null;
            System.out.println(name.length());
        }

        //HANDLING THE EXCEPTION USING ROOT CLASS OF THE EXCEPTION
        catch(Exception ex){        //CATCH BLOCK USES THE PARTICULAR CLASS FROM THE ROOT CLASS TO HANDLE THE EXCEPTION
            System.out.println("Handled by Exception class");
        }

        //HANDLING NULL POINTER EXCEPTION
        catch (NullPointerException ex){        //CANNOT USE A CATCH WITH THE SAME CLASS AS THE EXCEPTION IS ALREADY HANDLED IN THE ABOVE ROOT CLASS
            System.out.println("Handled by ArithmeticException class");
        }

        finally{        //UNREACHABLE STATEMENT
            System.out.println("Finally Block");
        }
    }
}
