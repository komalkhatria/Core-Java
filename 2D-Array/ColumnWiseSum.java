import java.util.Scanner;
public class ColumnWiseSum {
    //METHOD TO CALCULATE SUM OF ELEMENTS OF EACH COLUMN OF 2D ARRAY
    static void sumOfElements(int a[][], int cols){

        //INITIALIZE COLUMNS WITH 0 INDEX
        int j=0;

        //LOOP THROUGH EACH COLUMN
        while(j<cols){
            int sum=0;
            for(int i=0; i<a.length; i++){      //TRAVERSING THROUGH EACH ROW OF A PARTICULAR COLUMN
                sum+=a[i][j];       //STORING SUM OF ELEMENTS OF A PARTICULAR COLUMN

            }
            System.out.println("Sum of column " + (j+1) + " = " + sum);
            j++;
        }

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

        sumOfElements(a, cols);
    }
}
