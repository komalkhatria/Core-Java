import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size= sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=size; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
