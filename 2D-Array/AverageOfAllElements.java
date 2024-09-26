import java.util.Scanner;
public class AverageOfAllElements {

    //METHOD TO CALCULATE AVERAGE OF ALL ELEMENTS OF 2D ARRAY
    static void averageOfElements(int a[][], int rows, int cols){
        int total=0;
        int elements= rows*cols;        //TOTAL NO. OF ELEMENTS IN THE 2D ARRAY

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                total+= a[i][j];      //ADDING EACH ELEMENT OF THE 2D ARRAY TO TOTAL
            }
        }

        //FINDING AVERAGE BY DIVIDING SUM OF ELEMENTS BY TOTAL NO. OF ELEMENTS
        System.out.println("Average of all elements is " + (total/elements));
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

        averageOfElements(a, rows, cols);
    }
}
