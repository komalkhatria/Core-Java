public class StringBuilderConstructors {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder();
        System.out.println(sb);             //no output

        StringBuilder sb1= new StringBuilder("Java");
        System.out.println(sb1);

        StringBuilder sb2= new StringBuilder(5);      // Constructs a string builder with no characters in it
    }
}
