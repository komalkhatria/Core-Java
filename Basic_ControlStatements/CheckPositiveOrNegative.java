import java.util.Scanner;
public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.print("Enter a: ");
        a= sc.nextInt();

        if(a>0){
            System.out.println(a + " is a positive integer");
        }
        else if(a<0){
            System.out.println(a + " is a negative integer");
        }
        else{
            System.out.println(a + " is equal to zero");
        }
    }
}
