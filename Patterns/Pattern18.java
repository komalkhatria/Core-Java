import java.util.Scanner;
public class Pattern18 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size= sc.nextInt();

        for(int i=size; i>=1; i--){
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