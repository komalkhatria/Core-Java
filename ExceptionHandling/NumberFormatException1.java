public class NumberFormatException1 {
    public static void main(String[] args) {

        //CONTAINS CODE WHERE EXCEPTION MAY OCCUR
        try{
            String greeting= "hello";
            int n= Integer.parseInt(greeting);      //STRING OF CHARACTERS CANNOT BE COVERTED TO INT USING parseInt METHOD
        }

        //HANDLES THE PARTICULAR EXCEPTION IF OCCURS
        catch(NumberFormatException ex){
            System.out.println("Exception handled");
        }

        //ALWAYS RUNS WHETHER EXCEPTION OCCURS OR NOT, HANDLED OR NOT
        finally {
            System.out.println("Only numbers that are in String format can be converted into integer using parseInt method");
        }
    }
}
