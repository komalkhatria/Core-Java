import java.util.Scanner;
public class InsertArrayElement {

    //METHOD TO INPUT ELEMENT AT A PARTICULAR INDEX
    static int[] insertElement(int arr[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter index to input element: ");
        int index= sc.nextInt();
        if(index<arr.length-1){
            System.out.print("Enter the value of index " + index + ": ");
            arr[index]=sc.nextInt();
        }
        else{
            System.out.println("PLEASE INPUT INDEX LESS THAN " + arr.length + "!");
        }
        return arr;
    }

    //METHOD TO PRINT ARRAY
    static void displayArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //INPUT ARRAY SIZE AND ELEMENTS
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int arr[]= new int[size];

        int a[]= insertElement(arr);    //STORING THE ARRAY THAT IS RETURNING AFTER INSERTING ELEMENT
        insertElement(arr);
        insertElement(arr);
        displayArray(a);
    }
}
