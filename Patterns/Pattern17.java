import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size= sc.nextInt();

        for(int i=1; i<=size; i++){
            for(int h=size-1; h>=i; h--){
                System.out.print("#");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}