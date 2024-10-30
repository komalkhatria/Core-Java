import java.util.Scanner;
public class Pattern46 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size= sc.nextInt();

        for(int i=1; i<=size; i++){
            char ch= 'a';
            for(int j=1; j<=size; j++){
                if(j<=i){
                    System.out.print(ch);
                }
                else{
                    System.out.print("*");
                }
                ch++;
            }
            System.out.println();
        }
    }
}
