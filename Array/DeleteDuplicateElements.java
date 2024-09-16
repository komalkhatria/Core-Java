import java.util.Scanner;
public class DeleteDuplicateElements {

    //METHOD TO DELETE DUPLICATE ELEMENTS
    static void deleteDuplicates(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    a[j]=-1;        //REMOVING DUPLICATE
                }
            }
            if(a[i]>-1){
                System.out.print(a[i] + " ");
            }
        }
    }

    //METHOD TO PRINT ARRAY
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //INPUT ARRAY SIZE AND ELEMENTS
        System.out.print("Enter array size: ");
        int size= sc.nextInt();

        //ORIGINAL ARRAY DECLARATION AND DEFINITION (through user input)
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Original array: ");
        display(arr);   //CALLING METHOD THAT PRINTS ARRAY
        System.out.println();

        System.out.print("Array (removed duplicates): ");
        deleteDuplicates(arr);  //ARRAY AFTER DUPLICATE ELEMENTS DELETION
    }
}
