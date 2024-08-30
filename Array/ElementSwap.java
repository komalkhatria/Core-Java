import java.util.Scanner;
public class ElementSwap {
    //METHOD TO SWAP FIRST AND LAST ELEMENT OF ARRAY
    static void swapElements(int a[]){
        int temp= a[0];
        a[0]= a[a.length-1];
        a[a.length-1]= temp;
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
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

//        //FIRST AND LAST ELEMENT SWAP WITHOUT USING METHOD
//        int temp= arr[0];
//        arr[0]= arr[size-1];
//        arr[size-1]= temp;
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        //CALLING SWAP ELEMENT METHOD
        swapElements(arr);


    }
}
