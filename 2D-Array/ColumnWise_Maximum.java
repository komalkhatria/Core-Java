import java.util.Scanner;
public class ColumnWise_Maximum {

    //METHOD TO FIND THE MAXIMUM ELEMENT IN EACH COLUMN OF 2D ARRAY
    static void findMaximum(int a[][], int cols){
        for(int i=0; i<cols; i++){      //OUTER LOOP IS FOR COLUMN
            int max=a[0][i];        //ASSUMING FIRST ELEMENT OF EVERY COLUMN TO BE THE MAXIMUM
            int max_index=0;        //FOR ROW
            for(int j=1; j<a.length; j++){      //INNER LOOP IS FOR ELEMENTS WITHIN THE COLUMN
                if(a[j][i] > max){
                    max= a[j][i];       //UPDATING THE VALUE OF MAXIMUM IF CURRENT ELEMENT IS GREATER THAN THE PREVIOUS VALUE
                    max_index=j;
                }
            }
            System.out.println("Maximum element of column " + (i+1) + " = " + max + " found at index [" +  max_index + "][" + i + "]");
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

        findMaximum(a, cols);
    }
}
