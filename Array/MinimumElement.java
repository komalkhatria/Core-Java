import java.util.Scanner;

public class MinimumElement {
    //METHOD TO PRINT ARRAY
    static void printArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    //METHOD TO FIND MINIMUM ELEMENT IN AN ARRAY
    static void findMinimum(int a[]){
        int min= a[0];      //ASSUMING a[0] IS THE MINIMUM
        for(int i=1; i<a.length; i++){
            if(a[i]<min){
                min= a[i];      //UPDATING THE VALUE OF MINIMUM
            }
        }
        System.out.println("Minimum= " + min);
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        printArray(arr);
        findMinimum(arr);

    }
}
