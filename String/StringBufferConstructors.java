public class StringBufferConstructors {
    public static void main(String[] args) {

        StringBuffer sb= new StringBuffer();
        System.out.println(sb);             //no output

        StringBuffer sb1= new StringBuffer("Java");
        System.out.println(sb1);

        StringBuffer sb2= new StringBuffer(5);      //creates an empty string buffer with the specified capacity as length.


    }
}
