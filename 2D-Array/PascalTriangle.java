import java.util.Scanner;
public class PascalTriangle {

    //METHOD TO PRINT ARRAY
    static void printArray(int a[][]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //METHOD TO RETURN PASCAL TRIANGLE 2D ARRAY
    static int[][] printPascal(int n){
        int step[][]= new int[n][];     //RESULTANT ARRAY
        for(int i=0; i<n; i++){
            step[i]= new int[i+1];      //BREAKING THE RESULTANT 2D ARRAY INTO DIFFERENT 1D ARRAYS
            step[i][0]=step[i][i]=1;
            for(int j=1; j<i; j++){
                step[i][j]= step[i-1][j-1] + step[i-1][j];
            }
        }
        return step;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //INPUT NO. OF ROWS AND COLUMNS
        System.out.print("Enter no. of rows for pascal triangle: ");
        int rows= sc.nextInt();

        int arr[][]= printPascal(rows);
        printArray(arr);
    }

}
