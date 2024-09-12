import java.util.Scanner;
public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n1, n2, n3;
        System.out.print("Enter number 1: ");
        n1= sc.nextInt();
        System.out.print("Enter number 2: ");
        n2= sc.nextInt();
        System.out.println("Real num 1 is " + n1 );
        System.out.println("Real num 2 is " + n2 );

        //SWAP USING THIRD VARIABLE
        n3=n1;
        n1=n2;
        n2=n3;
        System.out.println("Swapped num 1 is " + n1);
        System.out.println("Swapped num 2 is " + n2);

    }
}
