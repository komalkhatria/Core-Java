import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size = sc.nextInt();

        int n = 2;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(n + " ");
                n+=2;
            }
            System.out.println();
        }
    }
}
