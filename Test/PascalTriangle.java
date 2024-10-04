import java.util.Scanner;
public class PascalTriangle {
    static void printArray(int a[][]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printPascalTriangle(int n){
        int pascal[][]= new int[n][n];

        for(int i=0; i<n;i++){
            pascal[i][0]= 1;
            pascal[i][i]= 1;
            for(int j=1; j<i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int s=0; s<n-i; s++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows= sc.nextInt();

        printPascalTriangle(rows);
    }
}
