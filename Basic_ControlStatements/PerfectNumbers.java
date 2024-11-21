import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter range start: ");
        int start= sc.nextInt();
        System.out.print("Enter range end: ");
        int end= sc.nextInt();

        System.out.println("Perfect numbers between " + start + " and " + end + ": ");

        for(int i=start; i<=end; i++){
            int sum= 0;
            for(int j=1; j<i; j++){
                if(i%j==0){
                    sum = sum+ j;
                }
            }
            if(sum==i){
                System.out.print(i + " ");
            }
        }
    }
}
