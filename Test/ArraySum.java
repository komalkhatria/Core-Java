import java.util.Scanner;
public class ArraySum {
    static void sumOfArray(int a[]){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        System.out.println("Sum of all elements= " + sum);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        sumOfArray(arr);
    }
}
