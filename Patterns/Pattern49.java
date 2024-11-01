import java.util.*;
public class Pattern49 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size= sc.nextInt();
        int n=1;

        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++) {
                if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print(n + " ");
                    n++;
                }
            }
            System.out.println();
        }
    }
}


/*
        * 1 * 2 *
        3 * 4 * 5
        * 6 * 7 *
        8 * 9 * 10
        * 11 * 12 *
        */
