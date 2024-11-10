public class StringMethods {
    public static void main(String[] args) {

        //CREATING STRING
        String s= "System Design";
        String s1= "System design";
        String s2= "   Java ";


        //charAt()
        System.out.println(s.charAt(7));    //m

        //concat()
        System.out.println(s.concat(" Concept"));    //System Design Concept

        //equals()
        System.out.println(s.equals(s1));   //false

        //equalsIgnoreCase()
        System.out.println(s.equalsIgnoreCase(s1));     //true

        //substring()
        System.out.println(s.substring(3));     //tem Design
        System.out.println(s.substring(4, 11));     //em Desi

        //length()
        System.out.println(s.length());     //13

        //replace()
        System.out.println(s.replace('e', 'o'));    //Systom Dosign

        //toLowerCase()
        System.out.println(s.toLowerCase());    //system design

        //toUpperCase()
        System.out.println(s.toUpperCase());    //SYSTEM DESIGN

        //trim()
        System.out.println(s2);
        System.out.println(s2.trim() + " language");


    }
}
