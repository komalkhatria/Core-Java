import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //STRING INPUT
        System.out.print("Enter a string: ");
        String s= sc.nextLine();

        String str[]= s.split(" ");
        String ab[]=new String[str.length];

        for(int i=str.length-1; i>=0; i--){
            ab[i]=str[str.length-i-1];
        }

        System.out.println("Reversed words: ");
        for(int i=0;i<ab.length;i++){
            System.out.print(ab[i]+ " ");
        }
    }
}
