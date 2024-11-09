// StringBuffer stores String(in heap), it is mutable
public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Java");
        System.out.println(sb);

        sb.append(" is fun");       // as it is mutable, the String value will be changed
        System.out.println(sb);

        sb= sb.append(" to learn");
        System.out.println(sb);        // Java is fun to learn

        final StringBuffer sb1= new StringBuffer("Python");
        System.out.println(sb1);

        sb1.append(" is easy");
        System.out.println(sb1);

        sb1= sb1.append(" is dynamic");         //ERROR- cannot assign value to final variable
        System.out.println(sb1);
    }
}
