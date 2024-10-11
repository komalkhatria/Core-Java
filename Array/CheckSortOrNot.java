import java.util.Scanner;
public class CheckSortOrNot {
    static void printArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void swap(int a[], int i, int j){
        int temp=a[i];
        a[i]= a[j];
        a[j]= temp;
    }
    static void sortArray(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    swap(a, i, j);
                }
            }
        }
        System.out.print("Array after sorting: ");
        printArray(a);
    }
    static void checkSort(int a[]){
        boolean flag= true;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    flag=false;
                    break;
                }
            }
        }
        if(flag==false){
            System.out.println("Array is not sorted");
            sortArray(a);
        }
        else{
            System.out.println("Array is sorted");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        checkSort(arr);
    }
}
