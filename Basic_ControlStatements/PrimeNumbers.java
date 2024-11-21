import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter range start: ");
        int start= sc.nextInt();
        System.out.print("Enter range end: ");
        int end= sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ": ");

        for(int i=start; i<=end; i++){
            boolean flag = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    flag= false;
                }
            }
            if(flag==true){
                System.out.print(i + " ");
            }
        }
    }
}
