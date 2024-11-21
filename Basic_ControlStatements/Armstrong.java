import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter range start: ");
        int start= sc.nextInt();
        System.out.print("Enter range end: ");
        int end= sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ": ");

        for(int i=start; i<=end; i++){

            int num= i;
            int sum= 0;
            while(num>0){
                int rem= num%10;
                sum= sum+ rem*rem*rem;
                num= num/10;
            }
            if(sum==i){
                System.out.print(i + " ");
            }
        }
    }
}
