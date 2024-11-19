public class StringBufferMethods{

    public static void main(String[] args) {

        StringBuffer sb= new StringBuffer("Hello world");
        System.out.println(sb);

        //charAt()
        System.out.println(sb.charAt(3));

        //length()
        System.out.println(sb.length());

        //capacity()
        System.out.println(sb.capacity());

        //append()
        System.out.println(sb.append("!!!"));

        //insert()
        System.out.println(sb.insert(3, 'y'));

        //delete
        sb.delete(4, 7);
        System.out.println(sb);

        //deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println(sb);

        //reverse()
        System.out.println(sb.reverse());
        System.out.println(sb);

        //setLength()
        sb.setLength(15);
        System.out.println(sb.length());

        //trimToSize()
        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}