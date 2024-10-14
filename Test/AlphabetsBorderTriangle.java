import java.util.Scanner;

public class AlphabetsBorderTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows for pattern: ");
        int rows= sc.nextInt();
        char ch='A';
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows*2) -1; j++){
                if(i+j==rows+1 || j-i==rows-1 || i==rows){
                    System.out.print(ch + " ");
                    ch++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}