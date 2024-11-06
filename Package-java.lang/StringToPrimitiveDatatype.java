// Convert String to integer datatype using parseInt() method
public class StringToPrimitiveDatatype {
    public static void main(String[] args) {
        String name= "123";
        int i= Integer.parseInt(name);
        System.out.println(i);

        int b=i;
        System.out.println(b+5);    //validating the conversion of String to int datatype by adding an integer to it
    }
}
