import java.util.Scanner;
public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b;
        System.out.print("Enter a: ");
        a= sc.nextInt();
        System.out.print("Enter b: ");
        b= sc.nextInt();
        if(a>b){
            System.out.println(a + " is maximum");
        }
        else if(b>a){
            System.out.println(b + " is maximum");
        }
        else{
            System.out.println(a + " and " + b + " are equal");
        }
    }
}
