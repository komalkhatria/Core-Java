import java.util.Scanner;

public class DiagonalSum {

    static void addDiagonalElements(int a[][]){
        int sum=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        System.out.print("Diagonal elemnts sum= " + sum);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter no. of rows for matrix: ");
        int rows= sc.nextInt();
        System.out.print("Enter no. of columns for matrix: ");
        int cols= sc.nextInt();

        int a[][]= new int[rows][cols];

        for(int i=0; i<rows; i++){
            System.out.print("Enter " + cols + " elements for row " + (i+1) + ": ");
            for(int j=0; j<cols; j++){
                a[i][j]= sc.nextInt();
            }
        }

        addDiagonalElements(a);
    }
}
