import java.util.Scanner;
public class InterviewPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int size=sc.nextInt();

        for(int i=1; i<=size; i++){
            int n=10;
            for(int j=1; j<=size; j++){
                if(i==j || i==1 || j==size){
                    System.out.print(n + " ");
                }
                else{
                    System.out.print("   ");
                }
                n++;
            }
            System.out.println();
        }
    }
}
