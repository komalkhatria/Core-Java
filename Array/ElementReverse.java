import java.util.Scanner;
public class ElementReverse{

    //METHOD TO REVERSE DIGITS OF EACH ELEMENT OF AN ARRAY
    static void reverseElement(int a[]){
        for(int i=0; i<a.length; i++){
            int sum=0;
            while(a[i]>0){
                sum= sum*10 + a[i]%10;
                a[i]= a[i]/10;
            }
            System.out.print(sum + " ");
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
        reverseElement(arr);
    }
}