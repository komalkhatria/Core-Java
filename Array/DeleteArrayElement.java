import java.util.Scanner;
public class DeleteArrayElement {

    //METHOD TO DELETE VALUE AT AN INDEX
    static void deleteElement(int arr[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an index to delete its value: ");
        int index= sc.nextInt();

        if(index<arr.length){
            arr[index]=-1;
            System.out.print("Array after element deletion: ");
            for(int i=0; i<arr.length; i++){
                if(arr[i] > -1){
                    System.out.print(arr[i] + " ");
                }
            }
        }
        else{
            System.out.println("INVALID INDEX PASSED");
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

        deleteElement(arr);   //ARRAY AFTER ELEMENT DELETION


    }
}
