import java.util.Scanner;

public class Pattern36 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size = sc.nextInt();

        int n=1;
        for(int i=1; i<=size; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i*i + " ");
                n++;
            }
            System.out.println();
        }
    }
}