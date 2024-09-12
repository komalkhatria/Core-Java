import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        //USING FOR LOOP
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //USING WHILE LOOP
        int i = 1;
        while (i <= rows) {
            int j = rows;
            while (j >= i) {
                System.out.print("*");
                j--;
            }
            i++;
            System.out.println();
        }

    }
}
