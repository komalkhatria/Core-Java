import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int rem, sum=0;
        int n= num;         //Example: 153 is an armstrong number
        while(n>0){         //(1*1*1) + (5*5*5) + (3*3*3) = 153
            rem= n%10;
            sum+= rem* rem* rem;
            n= n/10;
        }

        if(sum==num){
            System.out.println(num + " is an armstrong number");
        }
        else{
            System.out.println(num + " is not an armstrong number");
        }
    }
}
