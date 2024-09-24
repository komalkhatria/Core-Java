import java.util.Scanner;
public class FindMinimum {
    //METHOD TO FIND THE MINIMUM ELEMENT IN A 2D ARRAY
    static void minOfElements(int a[][]){
        int last_element= a[a.length-1][a[a.length-1].length-1];
        int min=last_element;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j] <min){
                    min= a[i][j];       //UPDATING THE VALUE OF mIN IF CURRENT ELEMENT IS LESS THAN THE PREVIOUS ONE
                }
            }
        }
        System.out.println("Minimum of all elements is " + min);
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

        minOfElements(a);
    }
}
