import java.util.Scanner;
public class FibonacciPattern {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //FIBONACCI TRIANGLE
        System.out.print("Enter pattern size: ");
        int size= sc.nextInt();
        int a=1, b=1;

        for(int i=1; i<=size; i++){
            for(int f=1; f<=i; f++){
                System.out.print(a + " ");
                int result = a+b;
                a=b;
                b=result;
            }
            System.out.println();
        }
    }
}
