import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //USING FOR LOOP
        System.out.print("Enter no. of rows: ");
        int rows= sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int cols= sc.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //USING WHILE LOOP
        int i=1;
        while(i<=rows){
            int j=1;
            while(j<=cols){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }


    }
}

