import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size= sc.nextInt();
        for(int i=size; i>=1; i--){
            for(int j=1; j<=size; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

