import java.util.Scanner;
public class Pattern56 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter pattern size: ");
        int size= sc.nextInt();

        for(int i=1; i<=size; i++){
            for(int j=1; j<size*2; j++){
                if(i+j==size+1 || j-i==size-1 || (i==size && j%2==1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
