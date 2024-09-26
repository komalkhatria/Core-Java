import java.util.Scanner;
public class BorderSum {

    //METHOD TO CALCULATE SUM OF ALL ELEMENTS ON THE BORDER OF 2D ARRAY
    static void borderSum(int a[][]){
        int sum=0;      //INITIALISING sum WITH 0
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(i==0 || j==0 || i==a.length-1 || j==a[i].length-1){      //TARGETING BORDER INDICES
                    sum+=a[i][j];       //ADDING TO SUM, THE VALUE OF ALL ELEMENTS ON THE BORDER INDICES
                }
            }
        }
        System.out.println("Sum of all border elements = " + sum);
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

        // CALLING THE METHOD TO CALCULATE SUM OF BORDER ELEMENTS OF THE ARRAY
        borderSum(a);
    }
}
