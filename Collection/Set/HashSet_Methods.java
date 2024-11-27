import java.util.*;
public class HashSet_Methods {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size for hashset: ");
        int size= sc.nextInt();

        HashSet<String> hs= new HashSet<>();
        System.out.print("Input " + size + " elements in the hashset: ");
        for(int i=0; i<size; i++){
            String s= sc.next();

            //add() adds the specified element in set if it is not already present
            hs.add(s);
        }

        //clone()
        HashSet hs_clone= new HashSet();
        hs_clone= (HashSet)hs.clone();
        System.out.println(hs_clone);

        //contains()
        System.out.println(hs.contains("hello"));

        HashSet<String> h2= new HashSet<>();
        h2.add("hi");
        h2.add("hello");
        h2.add("bye");
        System.out.println(h2);

        //addAll()
        h2.addAll(hs);
        System.out.println(h2);

        //remove()
        hs.remove("bye");

        //removeAll()
        h2.removeAll(hs);
        System.out.println(h2);

        //isEmpty()
        System.out.println(h2.isEmpty());

        //size()
        System.out.println(h2.size());

        //iterator()
        Iterator itr= hs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        //spliterator()
        Spliterator spr= hs.spliterator();

        //forEachRemaining() is the method of Spliterator
        spr.forEachRemaining(
                n -> System.out.println(n)
        );

    }
}
