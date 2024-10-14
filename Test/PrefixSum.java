import java.util.Scanner;
public class PrefixSum {

    static void prefixSum(int a[]){
        System.out.print("Prefix sum: ");
        for(int i=0; i<a.length; i++){
            int sum=0;
            for(int j=0; j<=i; j++){
                sum+=a[j];
            }
            System.out.print(sum + " ");
        }
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
        prefixSum(arr);
    }
}
