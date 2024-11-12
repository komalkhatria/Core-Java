import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //STRING INPUT
        System.out.print("Enter a string: ");
        String s= sc.nextLine();

        String str[]= s.split(" ");

        int count= 0;
        for(int i=0; i<str.length; i++){
            count++;
            System.out.println(str[i]);
        }
        System.out.println("Total words= " + count);
        System.out.println("First word= " + str[0]);
        System.out.println("Last word= " + str[str.length-1]);
    }
}
