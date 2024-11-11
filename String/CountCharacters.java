import java.util.Scanner;
public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //STRING INPUT
        System.out.print("Enter a string: ");
        String s= sc.nextLine();

        //CONVERT THE STRING TO CHAR ARRAY
        char c[]= s.toCharArray();

        int count= 0;
        for(int i=0; i<c.length; i++){
            count++;
        }

        System.out.println("No. of characters in the string: " + count);

    }
}
