import java.util.Scanner;
public class Addition2Darray {
    static void add(int a[][], int b[][]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
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


        int b[][]= new int[rows][cols];

        for(int i=0; i<rows; i++){
            System.out.print("Enter " + cols + " elements for row " + (i+1) + ": ");
            for(int j=0; j<cols; j++){
                b[i][j]= sc.nextInt();
            }
        }

        add(a, b);
    }

}
