import java.util.Scanner;
public class PrimeOrNot {
    static void check(int n){
        if(n>0){
            prime(n);
        }
        else if(n<0){
            System.out.println("Please enter a positive number");
        }
        else{
            System.out.println("Invalid input");
        }
    }
    static void prime(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count<=2){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        check(n);
    }
}
