import java.util.Scanner;

public class Maximum_Minimum_RowSum {
    //METHOD TO CALCULATE SUM OF ELEMENTS OF EACH ROW OF 2D ARRAY
    static void sumOfElements(int a[][]){

        int max_sum=0;          //ASSUMING MAXIMUM SUM IS 0
        for(int i=0; i<a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];      //ADDING EACH ELEMENT OF THE ROW TO SUM
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sum);

            if (sum > max_sum) {
                max_sum = sum;      //UPDATING THE VALUE OF MAXIMUM SUM IF CURRENT ROW SUM IS MORE THAN CURRENT VALUE OF MAXIMUM SUM
            }
        }

        min_sum(a, max_sum);

        System.out.print("Maximum sum: " + max_sum);
    }

    //METHOD TO FIND MINIMUM ROW SUM
    static void min_sum(int a[][], int max){
        int min_sum= max;       //ASSUMING MINIMUM SUM IS EQUAL TO MAXIMUM ROW SUM
        for(int i=0; i<a.length; i++){
            int sum=0;
            for(int j=0; j< a[i].length; j++){
                sum+=a[i][j];
            }
            if(sum<min_sum){        //UPDATING THE VALUE OF MINIMUM SUM IF CURRENT ROW SUM IS LESS THAN CURRENT VALUE OF MINIMUM SUM
                min_sum= sum;
            }
        }
        System.out.println("Minimum sum: " + min_sum);
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
