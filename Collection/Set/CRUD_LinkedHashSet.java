// LinkedHashSet class contains unique elements only like HashSet.
// LinkedHashSet class provides all optional set operations and permits null elements.
// LinkedHashSet class is non-synchronized.
// LinkedHashSet class maintains insertion order.

import java.util.*;
public class CRUD_LinkedHashSet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //CREATE HETEROGENOUS LINKEDHASHSET
        System.out.print("Enter size for set: ");
        int size= sc.nextInt();
        LinkedHashSet h= new LinkedHashSet();
        System.out.print("Enter " + size + " heterogenous elements for linked hashset: ");
        for(int i=0; i<size; i++){
            String s= sc.next();
            h.add(s);
        }
        System.out.println(h);


        //CREATE HOMOGENOUS LINKED HASHSET
        LinkedHashSet<Short> hs= new LinkedHashSet<>();
        System.out.print("Enter " + size + " integer elements for linked hashset: ");
        for(int i=0; i<size; i++){
            short n= sc.nextShort();
            hs.add(n);
        }

        System.out.println(hs);     //DISPLAY HASHSET


        //READ
        for(short i: hs){             //Iterating using for-each loop
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator itr= hs.iterator();        //Iterating using iterator
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        //We cannot use for loop to iterate linked hashset as get() method is not available in linked hashset


        //DELETE
        hs.remove(2);
        System.out.println(hs);


        //UPDATE
        hs.add((short)45);         //if the user had already input this value, then it will not be added to the linked hashset as it doesn't take duplicate values
        System.out.println(hs);


    }
}
