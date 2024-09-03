import java.util.Scanner;
public class CheckSumPrimeOrNeon {

    //METHOD TO BREAK THE ARRAY IN TWO PARTS AND PERFORM DIFFERENT OPERATIONS ON THEM
    static void primeNeon(int a[]) {
        int sum = 0, sum2 = 0;

        //CHECKING IF THE SUM OF FIRST HALF OF THE ARRAY IS A PRIME NUMBER
        for (int i = 0; i < a.length / 2; i++) {
            sum += a[i];
        }
        int flag = 0;
        for (int j = 2; j < sum; j++) {
            if (sum % j == 0) {
                flag = 1;
                break;
            }
            if (flag == 0) {
                System.out.println("The sum of first half array elements is a prime number");
                break;
            } else {
                System.out.println("The sum of first half array elements is not prime number");
                break;
            }
        }

        //CHECKING IF THE SECOND HALF OF THE ARRAY IS NEON NUMBER
        for (int i = (a.length / 2) + 1; i < a.length; i++) {
            sum2 += a[i];
        }
        int neon= sum2 * sum2;
        int rem = 0;
        while (neon > 0) {
            rem += neon % 10;
            neon = neon / 10;
        }

        if (rem == sum2) {
            System.out.println("The sum of second half array elements is a neon number");
        } else {
            System.out.println("The sum of second half array elements is not a neon number");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //INPUT ARRAY SIZE AND ELEMENTS
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        primeNeon(arr);

    }
}
