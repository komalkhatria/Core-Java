import java.util.Scanner;
public class NumberLineSorting {
    //METHOD TO PRINT ARRAY
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    //METHOD TO SWAP TARGET ELEMENTS OF ARRAY
    static void swap(int a[], int i, int j){
        int temp= a[i];
        a[i]= a[j];
        a[j]= temp;

    }
    //METHOD TO SORT INTEGERS IN ASCENDING ORDER
    static void sortIntegers(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){      //SWAP METHOD CALLED ONLY IF FORMER VALUE IS GREATER THAN THE LATTER VALUE
                    swap(a, i, j);
                }
            }
        }
        display(a);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " integers: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        //CALLING SORTING METHOD
        sortIntegers(arr);
    }
}
