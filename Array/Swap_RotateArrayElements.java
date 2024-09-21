import java.util.Scanner;
public class Swap_RotateArrayElements {
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void swap(int a[], int i, int j){
        int temp= a[i];
        a[i]= a[j];
        a[j]= temp;
        display(a);
    }
    static void rotateElements(int a[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter elements to rotate: ");
        int rotate= sc.nextInt();

        //LOOP FOR NO. OF TIMES OF ROTATION/SWAP OF ARRAY ELEMENTS
        for(int i=0; i<rotate; i++){
            System.out.print("Rotation " + (i+1) + ": ");
            swap(a, i, (a.length-1)-i);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Original array: ");
        display(arr);
        rotateElements(arr);
    }
}


    /*user input :
        3
        1 2 3 4 5 6 7 8 9 10


        output :10 9 8 4 5 6 7 3 2 1
        every rotation :first rotate
        second time rotation
        third time rotation */
