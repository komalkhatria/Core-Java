import java.util.Scanner;
public class MatrixMultiplication {
    static void printArray(int a[][]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] multiply(int a[][], int b[][]){
        int mul[][]= new int[a.length][a.length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                for(int k=0; k<a[i].length; k++){
                    mul[i][j]+= a[i][k] * b[k][j];
                }
            }
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter no. of rows for matrix: ");
        int rows= sc.nextInt();
        System.out.print("Enter no. of columns for matrix: ");
        int cols= sc.nextInt();

        int a[][]= new int[rows][cols];

        for(int i=0; i<rows; i++){
            System.out.print("Enter " + cols + " elements for row " + (i+1) + " of matrix1: ");
            for(int j=0; j<cols; j++){
                a[i][j]= sc.nextInt();
            }
        }


        int b[][]= new int[rows][cols];

        for(int i=0; i<rows; i++){
            System.out.print("Enter " + cols + " elements for row " + (i+1) + " of matrix 2: ");
            for(int j=0; j<cols; j++){
                b[i][j]= sc.nextInt();
            }
        }

        int mul[][]= multiply(a, b);
        printArray(mul);
    }
}
