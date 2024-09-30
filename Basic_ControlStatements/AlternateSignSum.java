import java.util.Scanner;
public class AlternateSignSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int num=n;

        //TEST INPUT: 10
        //EXPECTED OUTPUT: 7 (1+2-3+4-5+6-7+8-9+10)

        int sum=1;
        if(n>=1){
            while(n>1){
                if(n%2==0){
                    sum+=n;
                }
                else{
                    sum-=n;
                }
                n--;
            }
            System.out.println("Alternate sign sum of numbers from 1 to " + num + " = " + sum);
        }
        else{
            System.out.print("Number should atleast be 1 or greater");
        }

    }
}
