import java.util.Scanner;
public class ElementSwap {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        //FIRST AND LAST ELEMENT SWAP WITHOUT USING METHOD
        int temp= arr[0];
        arr[0]= arr[size-1];
        arr[size-1]= temp;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
