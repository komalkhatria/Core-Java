public class OneTryMultipleCatch {
    public static void main(String[] args) {
        try{
            System.out.println(7/0);        //ARITHMETIC EXCEPTION WILL OCCUR
        }

        //TRY BLOCK WILL FIND AND EXECUTE THE CATCH BLOCK THAT HANDLES THE PARTICULAR EXCEPTION OCCURS

        //HANDLING NULL POINTER EXCEPTION
        catch(NullPointerException ex){
            System.out.println(ex);
        }

        //HANDLING ARITHMETIC EXCEPTION
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
    }
}
