import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int size= sc.nextInt();
        for(int i=1; i<=size; i++){
            int x=1;
            for(int j=1; j<=size; j++){
                if(i+j>size){
                    System.out.print(x);
                    x++;
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
