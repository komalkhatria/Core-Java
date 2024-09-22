import java.util.Scanner;
public class LinearSearch {
    static void searchElement(int arr[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Search element: ");
        int target= sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.print(i+ " ");
            }
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
        searchElement(arr);

    }
}


    /*user input array :1,2,3,4,5,6,7,8,9,10
        search :6 linear search */
