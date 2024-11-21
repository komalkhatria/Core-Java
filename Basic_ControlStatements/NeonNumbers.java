import java.util.Scanner;
public class NeonNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter range start: ");
        int start= sc.nextInt();
        System.out.print("Enter range end: ");
        int end= sc.nextInt();

        System.out.println("Neon numbers between " + start + " and " + end + ": ");

        for(int i=start; i<=end; i++){
            int square= i*i;
            int sum= 0;
            while(square>0){
                sum= sum+ square%10;
                square/=10;
            }
            if(sum==i){
                System.out.print(i + " ");
            }
        }
    }
}
