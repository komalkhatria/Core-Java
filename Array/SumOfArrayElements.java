import java.util.Scanner;

public class SumOfArrayElements {
    static void sumOfArray(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        System.out.println("Sum= " + sum);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //sum of all array elements
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter elements for integer array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        sumOfArray(arr);
    }
}
