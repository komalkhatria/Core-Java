import java.sql.SQLOutput;
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a size: ");
        int size= sc.nextInt();
        //USING FOR LOOP
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //USING WHILE LOOP
        int i=1;
        while(i<=size){
            int j=1;
            while(j<=size){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
