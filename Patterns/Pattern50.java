/*
        *******
        ******
        *****
        ****
        ***
        **
        *
        **
        ***
        ****
        *****
        ******
        *******
*/

import java.util.Scanner;

public class Pattern50 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter pattern size: ");
        int size= sc.nextInt();

        for(int i=1; i<=size; i++){
            for(int s=1; s<=size; s++){
                if(i+s<=size+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        for(int i=2; i<=size; i++){
            for(int j=1; j<=size; j++){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
