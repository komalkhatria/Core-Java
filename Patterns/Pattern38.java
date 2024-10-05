import java.util.Scanner;

public class Pattern38 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size= sc.nextInt();

        int x=1;
        for(int i=1; i<=size; i++){
            int n=x;
            for(int j=1; j<=size; j++){
                System.out.print(n + " ");
                n+=2;
            }
            x+=2;
            System.out.println();
        }
    }
}
