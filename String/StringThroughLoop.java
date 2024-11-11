import java.util.Scanner;
public class StringThroughLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s= sc.nextLine();

        char c[]= s.toCharArray();
        System.out.println("Your answer: ");
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]);
        }
        System.out.println("\nLength= " + s.length());
    }
}
