import java.util.Scanner;
public class RowWise_Maximum {

    //METHOD TO FIND MAXIMUM ELEMENT OF EACH ROW IN A 2D ARRAY
    static void findMaximum(int a[][]){
        for(int i=0; i<a.length; i++){
            int max=a[i][0];        //ASSUMING FIRST ELEMENT OF EACH ROW TO BE THE MAXIMUM OF THAT PARTICULAR ROW
            for(int j=1; j<a[i].length; j++){
                if(a[i][j]>max){
                    max=a[i][j];        //UPDATING THE VALUE OF MAXIMUM IF THE CURRENT ELEMENT IS GREATER THAN MAXIMUM
                }
            }
            System.out.println("Maximum element of row " + (i+1) + " = " + max);
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

        //CALLING METHOD TO FIND MAXIMUM ELEMENT OF EACH ROW IN THE 2D ARRAY
        findMaximum(a);
    }
}
