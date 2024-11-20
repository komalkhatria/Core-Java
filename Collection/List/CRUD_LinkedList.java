import java.util.*;
public class CRUD_LinkedList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter arraylist size: ");
        int size= sc.nextInt();

        //CREATE
        LinkedList l= new LinkedList();
        for(int i=0; i<size; i++){
            l.add(sc.next());
        }


        //READ
        Iterator itr= l.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        //UPDATE
        l.set(2, 20);
        System.out.println(l.get(2));

        //DELETE
        l.remove(0);
        System.out.println(l);
    }
}