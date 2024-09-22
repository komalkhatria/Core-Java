import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size = sc.nextInt();

        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                if(j<=i){
                    System.out.print(j);
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
