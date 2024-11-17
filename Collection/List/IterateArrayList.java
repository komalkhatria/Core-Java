import java.util.*;
public class IterateArrayList
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //GENERIC ARRAYLIST
        ArrayList<String> al= new ArrayList<>();

        System.out.print("Enter size of array list: ");
        int size= sc.nextInt();

        //ADDING ELEMENTS TO ARRAYLIST BY USER INPUT
        System.out.print("Enter arraylist elements: ");
        for(int i=0; i<size; i++){
            String s= sc.next();
            al.add(s);
        }
        System.out.println(al);     //PRINTING THE ARRAYLIST


        //ITERATING ARRAYLIST

        //METHOD 1 - USING FOR LOOP
        for(int i=0; i<size; i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.println();

        //METHOD 2 - USING FOR-EACH LOOP
        for(String i: al){
            System.out.print(i + " ");
        }
        System.out.println();

        //METHOD 3 - USING Iterator INTERFACE
        Iterator itr= al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        //METHOD 4 - USING ListIterator INTERFACE
        ListIterator litr= al.listIterator();
        while(litr.hasNext()){
            System.out.print(litr.next() + " ");
        }

    }
}