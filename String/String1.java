// A string object cannot be altered but the reference to the object can be changed
public class String1 {
    public static void main(String[] args) {

        //METHOD 1
        String s= "Java is a programming language";     //String Constant Pool
        System.out.println(s);

        // METHOD 2
        String s2= new String("Hello");         //Heap --> SCP
        System.out.println(s2);

        s.concat(" and a platform");        //string is immutable, we cannot change the String
        System.out.println(s);

        s= s.concat(" and a platform.");
        System.out.println(s);


    }
}
