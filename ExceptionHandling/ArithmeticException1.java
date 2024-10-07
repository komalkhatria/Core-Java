public class ArithmeticException1 {
    public static void main(String[] args) {
        //try BLOCK CONTAINS THE CODE WHERE EXCEPTION MAY OCCUR
        try{
            int a=5, b=0;
            int c= a/b;     //DIVIDING ANY NUMBER BY ZERO GIVES ARITHMETIC EXCEPTION
            System.out.println(c);
        }

        //catch BLOCK IS USED TO HANDLE THE EXCEPTION, EXECUTES ONLY IF EXCEPTION OCCURS
        catch(ArithmeticException ex){
            System.out.println("Exception handled");
        }

    }
}
