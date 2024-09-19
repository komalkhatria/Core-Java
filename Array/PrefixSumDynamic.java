import java.util.Scanner;
public class PrefixSumDynamic {
    //METHOD TO PRINT ARRAY
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    //METHOD FOR PREFIX SUM
    static void prefixSum(int a[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter starting index: ");
        int start_index= sc.nextInt();
        System.out.print("Enter ending index: ");
        int end_index= sc.nextInt();
        for(int i=start_index; i<end_index; i++){
            a[i]= a[i-1]+a[i];
        }
        System.out.print("Prefix sum array: ");
        display(a);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " elements: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Original array: ");
        display(arr);
        prefixSum(arr);
    }
}
