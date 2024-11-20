import java.util.LinkedList;
import java.util.Scanner;
public class LinkedList1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        LinkedList l= new LinkedList();      //creating non-generic linkedlist
        l.add("Hello");        //adding value in linkedlist
        l.add('M');
        l.add(2024);
        l.add(8.5);
        System.out.println(l);

        System.out.print("Enter size of linkedlist: ");
        int size= sc.nextInt();
        LinkedList l1= new LinkedList();      //creating non-generic linkedlist

        System.out.print("Enter elements in arraylist: ");
        for(int i=0; i<size; i++){
            l1.add(sc.next());
        }
        System.out.println(l1);
    }
}
