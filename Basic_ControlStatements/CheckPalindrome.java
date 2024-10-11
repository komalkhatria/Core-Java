import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int rem, sum=0;
        int n= num;         //Example: 12321 is a palindrome number
        while(n>0){         //as its reverse i.e. 12321 = 12321
            rem= n%10;
            sum= sum*10 + rem;
            n= n/10;
        }

        if(sum==num){
            System.out.println(num + " is a palindrome number");
        }
        else{
            System.out.println(num + " is not a palindrome number");
        }
    }
}