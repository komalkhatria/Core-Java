public class Main {
    public static void main(String[] args) {
        try{
            int a=5, b=0;
            int c= a/b;
            System.out.println("The result is: ");
            System.out.println(c);
        }

        catch(ArithmeticException ex){
            System.out.println("Exception handled");
            System.exit(0);         //exit() IS A PARAMETERIZED, PREDEFINED METHOD OF System CLASS, USED TO EXIT FROM THE CODE
        }

        //NO STATEMENT BELOW System.exit(0) WILL EXECUTE, NOT EVEN Finally BLOCK
        finally{
            System.out.println("Exception handled, always runs");
        }

        System.out.println("Good day!");

    }
}
