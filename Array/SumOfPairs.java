import java.util.Scanner;
public class SumOfPairs {
    static void sumOfPairs(int arr[], int target){
        int count=0;
        System.out.println("Indices of pairs which sum up to " + target + ": ");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + ", " + j);
                    count++;
                }
            }
        }
        System.out.println("No. of pairs which sum up to " + target + " = " + count);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number to check the pairs which sum up to that number: ");
        int target= sc.nextInt();
        sumOfPairs(arr, target);
    }
}
