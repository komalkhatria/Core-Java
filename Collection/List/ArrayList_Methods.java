import java.util.*;
public class ArrayList_Methods {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<>();
        ll.add("Hindi");
        ll.add("English");
        ll.add("French");

        ArrayList<String> l= new ArrayList<>();

        //add()
        l.add("Physics");
        l.add("Chemistry");

        //addAll()
        l.addAll(ll);
        System.out.println(l);

        //clear()
        l.clear();

        //contains()
        System.out.println(l.contains("Sanskrit"));


        //indexOf()
        System.out.println(l.indexOf("Shawn"));

        //lastIndexOf()
        System.out.println(l.lastIndexOf("Justin"));

        //isEmpty()
        System.out.println(l.isEmpty());

        //remove()
        l.remove(2);
        System.out.println(l);
    }
}