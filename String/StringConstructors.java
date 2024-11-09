public class StringConstructors {
    public static void main(String[] args) {

        //CONSTRUCTOR 1
        String s = new String();
        System.out.println(s);

        //CONSTRUCTOR 2
        String s1= new String("String");
        System.out.println(s1);

        //CONSTRUCTOR 3
        StringBuffer sb= new StringBuffer("String Buffer");
        String s2= new String(sb);
        System.out.println(s2);

        //CONSTRUCTOR 4
        StringBuilder sb1= new StringBuilder("String Builder");
        String s3= new String(sb1);
        System.out.println(s3);

        //CONSTRUCTOR 5
        char c[]= {'a', 'e', 'i', 'o', 'u'};
        String s4= new String(c);
        System.out.println(s4);

        //CONSTRUCTOR 6
        byte b[]= {39, 15, 31, 42, 35};
        String s5= new String(b);
        System.out.println(s5);

    }
}
