import java.util.Scanner;
public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if((i%2==1 && j%2==1) || (i%2==0 && j%2==0)){
                    System.out.print(0+ " ");
                }
                else{
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}
