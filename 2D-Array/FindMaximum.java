import java.util.Scanner;
public class FindMaximum {

    //METHOD TO FIND THE MAXIMUM ELEMENT IN A 2D ARRAY
    static void maxOfElements(int a[][]){
        int max=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j] > max){
                    max= a[i][j];       //UPDATING THE VALUE OF max IF CURRENT ELEMENT IS GREATER THAN THE PREVIOUS ONE
                }
            }
        }
        System.out.println("Maximum of all elements is " + max);
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

        maxOfElements(a);
    }
}
