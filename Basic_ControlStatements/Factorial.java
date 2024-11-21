import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter range start: ");
        int start= sc.nextInt();
        System.out.print("Enter range end: ");
        int end= sc.nextInt();

        System.out.println("Factorials between " + start + " and " + end + ": ");

        for(int i=start; i<=end; i++){
            int fact= 1;
            for(int j=1; j<=i; j++){
                fact= fact * j;
            }
            System.out.println(i + ": " + fact);
        }
    }
}
