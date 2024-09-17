import java.util.Scanner;
public class OddEvenSort {
    static void swapElements(int a[], int i, int j){
        int temp= a[i];
        a[i]= a[j];
        a[j]= temp;
    }
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void oddEvenSort(int a[]){
        int left=0, right= a.length-1;
        while(left<right){
            if(a[left]%2==1){
                left++;
            }
            else if(a[right]%2==0){
                right--;
            }
            else{
                swapElements(a, left, right);
                left++;
                right--;
            }
        }

        display(a);
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

        oddEvenSort(arr);
    }
}
