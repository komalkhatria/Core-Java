import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> al= new ArrayList<>();      //creating generic arraylist
        al.add("Java");        //adding object in arraylist
        al.add("Python");
        al.add("C++");
        al.add("Javascript");
        System.out.println(al);

        System.out.print("Enter size of arraylist: ");
        int size= sc.nextInt();
        ArrayList<String> al1= new ArrayList<>();      //creating generic arraylist


        //adding objects by user input in arraylist through loop
        for(int i=0; i<size; i++){
            String s= sc.next();
            al1.add(s);
        }
        System.out.println(al1);
    }
}
