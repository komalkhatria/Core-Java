import java.util.Scanner;
public class SortArray {

    static void printArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //SWAP USING THIRD VARIABLE
    static void swap(int a[], int i, int j){
        int temp=a[i];
        a[i]= a[j];
        a[j]= temp;
    }

    //SWAP WITHOUT USING THIRD VARIABLE
    static void swap2(int a[], int i, int j){
        a[i]= a[i] + a[j];
        a[j]= a[i]- a[j];
        a[i]= a[i]- a[j];
    }
    static void sortArray(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    swap2(a, i, j);
                }
            }
        }
        System.out.print("Sorted array: ");
        printArray(a);
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
        sortArray(arr);
    }
}
