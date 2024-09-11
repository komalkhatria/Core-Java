import java.util.Scanner;

public class LinearSearch {
    static void searchElement(int a[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Search: ");
        int target= sc.nextInt();
        for(int i=0; i<a.length; i++){
            if(a[i]==target){
                System.out.print("Found at index ");
                break;
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]==target){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //INPUT ARRAY SIZE AND ELEMENTS
        System.out.print("Enter array size: ");
        int size= sc.nextInt();

        int arr[]= new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        searchElement(arr);
    }
}
