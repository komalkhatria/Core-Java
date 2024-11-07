// Convert String to Wrapper class using valueOf()
public class StringToWrapperClass {
    public static void main(String[] args) {
        String s= "12";
        Integer i= Integer.valueOf(s);
        System.out.println(i);

        System.out.println(i+5);        //Verifying the conversion by adding an integer to it
    }
}
