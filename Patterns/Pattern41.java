import java.util.Scanner;
public class Pattern41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size= sc.nextInt();

        for(int i=1; i<=size; i++){
            for(int j=1; j<=size*2-1; j++){
                if(j<size*2 -(i + i-1)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
