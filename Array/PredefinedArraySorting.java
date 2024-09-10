import java.util.Scanner;
import java.util.Arrays;
public class PredefinedArraySorting {

    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Original array: ");
        display(arr);
        System.out.println();

        //PREDEFINED STATIC METHOD sort() OF CLASS ARRAYS (used to sort array in ascending order)
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        display(arr);

    }
}
