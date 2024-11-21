import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the no. of elements for fibonacci series: ");
        int size= sc.nextInt();

        int a= 0, b= 1;
        for(int i=1; i<=size; i++){
            int c= a+b;
            System.out.print(a +" ");
            a= b;
            b= c;
        }
    }
}
