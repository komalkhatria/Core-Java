// StringBuilder stores String, it is mutable and non- synchronized
public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java");

        sb.append(" is fun");
        System.out.println(sb);     //Java is fun

        sb= sb.append(" to learn");
        System.out.println(sb);     //Java is fun to learn

        sb= new StringBuilder("code");      //object reassign
        System.out.println(sb);

        final StringBuilder sb1= new StringBuilder("Python");
        sb1.append(" programming");
        System.out.println(sb1);

        /*sb1= sb1.append(" programming");        //ERROR- cannot reassign value to final variable
        System.out.println(sb1);*/
    }
}
