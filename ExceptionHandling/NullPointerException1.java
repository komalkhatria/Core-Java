public class NullPointerException1 {
    public static void main(String[] args) {

        //CONTAINS CODE WHERE SOME EXCEPTION MAY OCCUR
        try{
            System.out.println("Hello");
            String name=null;
            System.out.println(name.length());      //EXCEPTION MAY OCCUR AS NAME IS NULL SO IT'S NOT POSSIBLE TO PRINT LENGTH OF NULL STRING
        }

        //HANDLE THE PARTICULAR EXCEPTION IF OCCURS
        catch(NullPointerException ex){
            System.out.println(ex.toString());
            System.out.println("Name not found");
        }

        //ALWAYS RUNS WHETHER EXCEPTION OCCURS OR NOT, HANDLED OR NOT
        finally {
            System.out.println("This is the finally block");
        }
    }
}
