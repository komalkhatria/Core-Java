import java.util.Scanner;
public class ThreeNumbersSort {
    //METHOD TO PRINT ARRAY
    static void displayArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    //METHOD TO SORT ARRAY
    static void sortElements(int a[]){
        for(int i=0; i<a.length; i++){
            a[i]= a.length-1-i;
        }
        displayArray(a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        if(size==3){
            int arr[]= new int[size];
            System.out.print("Enter " + size + " numbers(0,1,2): ");
            for(int i=0; i<size; i++){
                arr[i]= sc.nextInt();
            }
            if(arr[0]==0 && arr[1]==1 && arr[2]==2){
                sortElements(arr);
            }
            else{
                System.out.println("Valid array is- 0,1,2 !");
            }
        }
        else{
            System.out.print("Valid size is 3!");
        }

    }
}
