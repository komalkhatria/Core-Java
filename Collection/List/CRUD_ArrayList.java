import java.util.*;
public class CRUD_ArrayList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter arraylist size: ");
        int size= sc.nextInt();

        //CREATE
        ArrayList al= new ArrayList();
        for(int i=0; i<size; i++){
            al.add(sc.next());
        }

        //READ
        Iterator itr= al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        //UPDATE
        al.set(2, 20);
        System.out.println(al.get(2));

        //DELETE
        al.remove(4);
        System.out.println(al);
        System.out.println(al.get(4));
    }
}
