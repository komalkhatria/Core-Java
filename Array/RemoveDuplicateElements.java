import java.util.Scanner;
public class RemoveDuplicateElements {
    //METHOD TO REMOVE DUPLICATES FROM AN ARRAY
    static void deleteDuplicateElements(int arr[]){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                }
            }
            if(arr[i] > -1){
                System.out.print(arr[i] + " ");
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
        System.out.print("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Original array: ");
        display(arr);   //CALLING METHOD THAT PRINTS ARRAY
        System.out.println();

        System.out.print("Array without duplicates: ");
        deleteDuplicateElements(arr);  //ARRAY AFTER ELEMENT DELETION
    }
}
