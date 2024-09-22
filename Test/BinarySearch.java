import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    static void searchElement(int arr[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("\nSearch element: ");
        int target= sc.nextInt();
        int li=0, hi= arr.length, mi= (li+hi)/2;
        for(int i=0; i<arr.length; i++){
            if(arr[mi]==target){
                System.out.println(mi);
                break;
            }
            else if(arr[mi]<target){
                li= mi+1;
            }
            else if(arr[mi]>target){
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        searchElement(arr);
    }
}
