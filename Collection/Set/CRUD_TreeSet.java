// TreeSet class contains unique elements only like HashSet.
// TreeSet class access and retrieval times are quiet fast.
// TreeSet class doesn't allow null element.
// TreeSet class is non synchronized.
// TreeSet class maintains ascending order.
// TreeSet class contains unique elements only like HashSet.
// TreeSet class access and retrieval times are quite fast.
// TreeSet class doesn't allow null elements.
// TreeSet class is non-synchronized.
// TreeSet class maintains ascending order.

import java.util.*;
public class CRUD_TreeSet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size for set: ");
        int size= sc.nextInt();

        //CREATE TREESET
        TreeSet<Integer> ts= new TreeSet<>();
        System.out.print("Enter " + size + " integer elements for treeset: ");
        for(int i=0; i<size; i++){
            int n= sc.nextInt();
            ts.add(n);
        }

        //Treeset stores objects in sorted order
        System.out.println(ts);     //RETRIEVE TREESET


        //READ
        for(int i: ts){             //Iterating using for-each loop
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator itr= ts.iterator();        //Iterating using iterator
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        //We cannot use for loop to iterate treeset as get() method is not available in treeset

        //DELETE
        ts.remove(5);
        System.out.println(ts);


        //UPDATE
        ts.add(12);         //if the user had already input this value, then it will not be added to the treeset as it doesn't take duplicate values
        System.out.println(ts);
    }

}
