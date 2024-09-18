import java.util.Scanner;

public class PositiveNegativeSort {
    //METHOD TO PRINT ARRAY
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    //METHOD TO SWAP ELEMENTS
    static void swapElements(int a[], int i, int j){
        int temp= a[i];
        a[i]= a[j];
        a[j]= temp;
    }
    //METHOD TO SORT POSITIVE, NEGATIVE ELEMENTS OF ARRAY
    static void positiveNegativeSort(int a[]){
        int left=0, right=a.length-1;
        while(left<right){
            if(a[left]<0){
                left++;
            }
            else if(a[right]>0){
                right--;
            }
            else{
                swapElements(a, left, right);
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //INPUT ARRAY SIZE AND ELEMENTS
        System.out.print("Enter array size: ");
        int size= sc.nextInt();

        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        positiveNegativeSort(arr);
        display(arr);
    }
}
