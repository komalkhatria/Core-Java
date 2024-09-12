import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a, b, c, max=0;
        System.out.print("Enter a: ");
        a= sc.nextInt();
        System.out.print("Enter b: ");
        b= sc.nextInt();
        System.out.print("Enter c: ");
        c= sc.nextInt();

        if(a>b && a>c){
            max=a;
        }
        else if(b>a && b>c){
            max= b;
        }
        else if(c>a && c>b){
            max=c;
        }
        else{
            System.out.println("you entered same numbers");
        }
        System.out.println(max + " is maximum");

    }
}
