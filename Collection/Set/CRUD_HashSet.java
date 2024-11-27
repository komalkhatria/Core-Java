// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.
// HashSet class is non synchronized.
// HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
// HashSet is the best approach for search operations.
// The initial default capacity of HashSet is 16, and the load factor is 0.75.

import java.util.*;
public class CRUD_HashSet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //CREATE HETEROGENOUS HASHSET
        System.out.print("Enter size for set: ");
        int size= sc.nextInt();
        HashSet h= new HashSet();
        System.out.print("Enter " + size + " heterogenous elements for hashset: ");
        for(int i=0; i<size; i++){
            String s= sc.next();
            h.add(s);
        }
        System.out.println(h);


        //CREATE HOMOGENOUS HASHSET
        HashSet<Integer> hs= new HashSet<>();
        System.out.print("Enter " + size + " integer elements for hashset: ");
        for(int i=0; i<size; i++){
            int n= sc.nextInt();
            hs.add(n);
        }

        System.out.println(hs);     //RETRIEVE HASHSET


        //READ
        for(int i: hs){             //Iterating using for-each loop
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator itr= hs.iterator();        //Iterating using iterator
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        //We cannot use for loop to iterate hashset as get() method is not available in hashset


        //DELETE
        hs.remove(2);
        System.out.println(hs);


        //UPDATE
        hs.add(90);         //if the user had already input this value, then it will not be added to the hashset as it doesn't take duplicate values
        System.out.println(hs);


    }
}
