import java.util.Scanner;

public class Pattern40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size= sc.nextInt();

        for(int i=1; i<=size; i++){
            for(int j=1; j<=i+(i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
