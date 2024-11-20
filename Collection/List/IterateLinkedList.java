import java.util.*;
public class IterateLinkedList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //NON-GENERIC LINKEDLIST
        LinkedList l= new LinkedList();

        System.out.print("Enter size of linked list: ");
        int size= sc.nextInt();

        //ADDING ELEMENTS TO LINKEDLIST BY USER INPUT
        System.out.print("Enter linkedlist elements: ");
        for(int i=0; i<size; i++){
            Object o= sc.next();
            l.add(o);
        }
        System.out.println(l);     //PRINTING THE LINKEDLIST


        //ITERATING LINKEDLIST

        //METHOD 1 - USING FOR LOOP
        for(int i=0; i<l.size(); i++){
            System.out.print(l.get(i) + " ");
        }
        System.out.println();

        //METHOD 2 - USING FOR-EACH LOOP
        for(Object i: l){
            System.out.print(i + " ");
        }
        System.out.println();

        //METHOD 3 - USING Iterator INTERFACE
        Iterator itr= l.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        //METHOD 4 - USING ListIterator INTERFACE
        ListIterator litr= l.listIterator();
        while(litr.hasNext()){
            System.out.print(litr.next() + " ");
        }
        System.out.println();

        //METHOD 5 - USING var in for-each
        for(var i: l){
            System.out.print(i + " ");
        }

    }
}
