import java.util.Scanner;

public class ZeroOneSort {
    //METHOD TO SORT ZERO AND ONE
    static void sortBinary(int a[]){
        int count=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0){
                count++;
            }
        }
        for(int i=0; i<a.length; i++){
            if(i<count){
                System.out.print(0 + " ");
            }
            else{
                System.out.print(1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " binary numbers: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        sortBinary(arr);
    }
}
