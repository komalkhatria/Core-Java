import java.util.Scanner;
public class StringElementSwap {

    //METHOD TO SWAP FIRST AND LAST ELEMENT OF A STRING ARRAY
    static void swapElement(String a[]){
        String c= a[0];
        a[0]= a[a.length-1];
        a[a.length-1]= c;
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + "  ");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        String arr[]= new String[size];
        System.out.print("Enter string array elements: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.next();
        }
        System.out.println("Array after first and last element swap: ");
        swapElement(arr);
    }
}
