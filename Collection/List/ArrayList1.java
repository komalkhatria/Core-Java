import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList al= new ArrayList();      //creating non-generic arraylist
        al.add("Hello");        //adding object in arraylist
        al.add('M');
        al.add(2024);
        al.add(8.5);
        System.out.println(al);

        System.out.print("Enter size of arraylist: ");
        int size= sc.nextInt();
        ArrayList al1= new ArrayList();      //creating non-generic arraylist

        System.out.print("Enter elements in arraylist: ");
        for(int i=0; i<size; i++){
            al1.add(sc.next());
        }
        System.out.println(al1);
    }
}
