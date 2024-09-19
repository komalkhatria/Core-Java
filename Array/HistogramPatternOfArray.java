import java.util.Scanner;

public class HistogramPatternOfArray {

    static void histogram(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " elements(0-9): ");

        boolean flag= true;
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<size; i++){
            if(arr[i]<0 || arr[i]>9){
                flag=false;
                break;
            }
        }
        if(flag==true){
            histogram(arr);
        }

    }
}
