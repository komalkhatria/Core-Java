import java.util.*;
public class LinkedList_Methods {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        al.add("Justin");
        al.add("Zayn");
        al.add("Dua");

        LinkedList<String> l= new LinkedList<>();

        //add()
        l.add("Shawn");
        l.add("Taylor");

        //addAll()
        l.addAll(al);

        //addFirst()
        l.addFirst("Ed");
        l.addLast("Camila");

        //clear()
//        l.clear();

        //contains()
        System.out.println(l.contains("Zayn"));

        //element()
        System.out.println(l.element());

        //get()
        System.out.println(l.get(4));

        //getFirst()
        System.out.println(l.getFirst());

        //getLast()
        System.out.println(l.getLast());
        System.out.println(l);

        //indexOf()
        System.out.println(l.indexOf("Shawn"));

        //lastIndexOf()
        System.out.println(l.lastIndexOf("Justin"));

        //isEmpty()
        System.out.println(l.isEmpty());
    }
}
