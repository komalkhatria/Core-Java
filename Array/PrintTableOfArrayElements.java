import java.util.Scanner;
public class PrintTableOfArrayElements {
    static void printTable(int a[]){
        for (int i = 0; i < a.length; i++) {
            for(int j=1; j<=10; j++){
                System.out.println(a[i] + " * " + j + " = " + a[i]*j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        printTable(arr);
    }
}
