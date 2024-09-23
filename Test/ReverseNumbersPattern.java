import java.util.Scanner;
public class ReverseNumbersPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter pattern size: ");
        int size= sc.nextInt();


        for(int i=1; i<=size; i++){
            int x=size-(i-1);
            for(int j=1; j<=size; j++){
                if(i+j<=size+1){
                    System.out.print(x);
                }
                x--;
            }
            System.out.println();
        }
    }
}
