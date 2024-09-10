import java.util.Scanner;
public class UpdateArrayElement {

    //METHOD TO UPDATE VALUE OF AN ELEMENT IN AN ARRAY
    static int[] updateElement(int a[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter index to update value: ");
        int index= sc.nextInt();
        if(index<a.length-1){
            System.out.print("Enter new value for index " + index + ": ");
            a[index]= sc.nextInt();
        }
        //IF USER TRIES TO UPDATE VALUE OF AN INDEX THAT DOESN'T EXIST
        else{
            System.out.println("INDEX TO UPDATE SHOULD BE LESS THAN " + a.length);
        }
        return a;
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
        display(arr);
        System.out.println();

        int a[]= updateElement(arr);    //STORING UPDATED ELEMENT IN A NEW VARIABLE
        updateElement(a);

        System.out.print("Updated array: ");
        display(a);
    }
}
