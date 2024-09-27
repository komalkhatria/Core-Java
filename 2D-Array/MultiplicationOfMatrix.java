import java.util.Scanner;
public class MultiplicationOfMatrix {

    //METHOD TO PRINT 2D ARRAY
    static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){        //LOOP FOR ROWS
            for(int j=0; j<arr[i].length; j++){     //LOOP FOR COLUMNS
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //METHOD TO MULTIPLY TWO 2D ARRAYS/MATRICES
    static void multiply(int a[][], int b[][], int rows, int cols){
        int multi[][]= new int[rows][cols];     //NEW ARRAY STORING RESULT OF MULTIPLICATION

        for(int i=0; i<rows; i++){      //LOOP FOR ROWS
            for(int j=0; j<cols; j++){      //LOOP FOR COLUMNS
                for(int k=0; k<cols; k++){      //LOOP FOR ROW OF ARRAY 1 AND COLUMN OF ARRAY 2

                    //MULTIPLY EVERY ELEMENT OF ROW OF ARRAY 1 WITH EVERY ELEMENT OF COLUMN OF ARRAY 2
                    multi[i][j]+= a[i][k] * b[k][j];
                }
            }
        }
        printArray(multi);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //INPUT NO. OF ROWS AND COLUMNS FOR ARRAY 1
        System.out.print("Enter no. of rows for 1st matrix: ");
        int rows1= sc.nextInt();
        System.out.print("Enter no. of columns for 1st matrix: ");
        int cols1= sc.nextInt();

        //DECLARING ARRAY WITH USER INPUT SIZE FOR ROWS AND COLUMNS
        int a[][]= new int[rows1][cols1];

        //TAKING USER INPUT ELEMENTS
        for(int i=0; i<rows1; i++){
            System.out.print("Enter " + cols1 + " elements for row " + (i+1) + ": ");
            for(int j=0; j<cols1; j++){
                a[i][j]= sc.nextInt();      //ELEMENT INPUT ON THE INTERSECTION OF rows AND cols
            }
        }

        //INPUT NO. OF ROWS AND COLUMNS FOR ARRAY 2
        System.out.print("Enter no. of rows for 2nd matrix: ");
        int rows2= sc.nextInt();
        System.out.print("Enter no. of columns for 2nd matrix: ");
        int cols2= sc.nextInt();

        //DECLARING ARRAY WITH USER INPUT SIZE FOR ROWS AND COLUMNS
        int b[][]= new int[rows2][cols2];

        //TAKING USER INPUT ELEMENTS
        for(int i=0; i<rows2; i++){
            System.out.print("Enter " + cols2 + " elements for row " + (i+1) + ": ");
            for(int j=0; j<cols2; j++){
                b[i][j]= sc.nextInt();      //ELEMENT INPUT ON THE INTERSECTION OF rows AND cols
            }
        }

        //CALLING THE METHOD TO MULTIPLY TWO 2D ARRAYS
        multiply(a, b, rows1, cols1);
    }
}
