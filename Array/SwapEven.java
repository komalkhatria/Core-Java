import java.util.Scanner;
public class SwapEven {
    //METHOD TO PRINT ARRAY
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    //METHOD TO SWAP TWO NUMBERS OF AN ARRAY
    static void swap(int a[], int i, int j){
        int temp=a[i];
        a[i]= a[j];
        a[j]= temp;
    }
    //METHOD TO FIND FIRST AND LAST EVEN NUMBERS IN AN ARRAY
    static void findEven(int a[]){
        int first_even=-1, last_even=-1;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                if (first_even == -1) {
                    first_even= i;      //ASSIGN THE FIRST EVEN NUMBER INDEX
                }
                last_even=i;        //KEEP UPDATING LAST EVEN NUMBER
            }
        }
        swap(a, first_even, last_even);

        //DISPLAY ARRAY AFTER SWAPPING
        display(a);

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
        findEven(arr);
    }
}
