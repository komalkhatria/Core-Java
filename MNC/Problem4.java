/*An intelligence agency has received reports about some threats. The reports consist of
numbers in a mysterious method. There is a number “N” and another number “R”. Those
numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are
summed up and this action is performed ‘R’ number of times. The resultant is also a single
digit that is yet to be deciphered. The task here is to find the single-digit sum of the given
number ‘N’ by repeating the action ‘R’ number of times.
If the value of ‘R’ is 0, print the output as ‘0’.
*/


import java.util.Scanner;
public class Problem4{
    static void result(int n, int r){
        int sum=0, ways=0;
        for(int i=1; i<=r; i++){
            int num= n;
            while(num>0){
                sum+=num%10;
                num= num/10;
            }
        }
        while(sum>0){
            ways+= sum%10;
            sum/=10;
        }
        System.out.print("Possible ways to fill the cistern: " + ways);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n= sc.nextInt();
        System.out.print("Enter the value of R: ");
        int r= sc.nextInt();

        result(n, r);
    }
}
