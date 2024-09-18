import java.util.Scanner;
public class TwoPointerBinarySort {
    //METHOD TO PRINT ARRAY
    static void displayArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    //METHOD TO SWAP THE ELEMENTS OF ARRAY
    static void swapElements(int a[], int i, int j){
        int temp= a[i];
        a[i]= a[j];
        a[j]= temp;
    }
    //METHOD TO SORT ZERO AND ONE USING TWO-POINTER VARIABLES
    static void sortBinary(int a[]){
        int left=0, right=a.length-1;
        while(left<right){
            if(a[left]==0){
                left++;
            }
            else if(a[right]==1){
                right--;
            }
            else{
                swapElements(a, left, right);
                left++;
                right--;
            }
        }
        System.out.print("Sorted zero-one array: ");
        displayArray(a);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " binary numbers: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        sortBinary(arr);
    }
}
