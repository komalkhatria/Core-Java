import java.util.Scanner;
public class Pattern47 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size= sc.nextInt();

        char ch= 'e';
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                if(j>=i){
                    System.out.print(ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            ch--;
            System.out.println();
        }
    }
}



/*
eeeee
 dddd
  ccc
   bb
    a */