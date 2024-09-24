import java.util.Scanner;
public class SumOfAllElements {

    //METHOD TO CALCULATE SUM OF ALL ELEMENTS OF 2D ARRAY
    static void sumOfElements(int a[][]){
        int sum=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                sum+= a[i][j];      //ADDING EACH ELEMENT OF THE 2D ARRAY TO SUM
            }
        }
        System.out.println("Sum of all elements is " + sum);
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

        sumOfElements(a);
    }
}
