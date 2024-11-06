// Convert integer datatype to String using valueOf method or valueOf... toString methods
public class PrimitiveDatatypeToString {
    public static void main(String[] args) {

        //METHOD1
        int a= 23;
        String p= String.valueOf(a);
        System.out.println(p + 11);     //11 will be concatenated to p as it is String now

        //METHOD2
        Integer i= Integer.valueOf(a);      //Primitive datatype is first converted to Wrapper class
        String s= i.toString();             //Wrapper class is then converted to String using toString method
        System.out.println(s);

    }
}
