import java.util.Scanner;
public class TransposeOfMatrix {
    //METHOD TO PRINT 2D ARRAY
    static void displayArray(int a[][]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();       //BREAKING/CHANGING THE ROW
        }
        System.out.println();
    }

    //METHOD TO TRANSPOSE 2D ARRAY WITHOUT SWAPPING ELEMENTS
    static void transposeWithoutSwap(int a[][]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //METHOD TO TRANSPOSE 2D ARRAY BY SWAPPING ELEMENTS
    static void transposeWithSwap(int a[][]){
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a[i].length; j++){
                int temp=a[i][j];
                a[i][j]= a[j][i];
                a[j][i]= temp;
            }
        }
        displayArray(a);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //INPUT NO. OF ROWS AND COLUMNS
        System.out.print("Enter no. of rows: ");
        int rows= sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int cols= sc.nextInt();

        //DECLARING ARRAY WITH USER INPUT SIZE FOR ROWS AND COLUMNS
        int a[][]= new int[rows][cols];

        //TAKING USER INPUT ELEMENTS
        for(int i=0; i<rows; i++){
            System.out.print("Enter " + cols + " elements for row " + (i+1) + ": ");
            for(int j=0; j<cols; j++){
                a[i][j]= sc.nextInt();      //ELEMENT INPUT ON THE INTERSECTION OF rows AND cols
            }
        }

        System.out.println("Original array: ");
        displayArray(a);
        System.out.println("Transpose wihout swap: ");
        transposeWithoutSwap(a);
        System.out.println("Transpose wih swap: ");
        transposeWithSwap(a);
    }
}
