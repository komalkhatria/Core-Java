import java.util.Scanner;
public class Pattern55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter pattern size: ");
        int size= sc.nextInt();

        for(int i=1; i<=size; i++){
            for(int j=1; j<=size/2 +1; j++){
                if(i<=size/2 + 1){
                    if(j>=i){
                        System.out.print(j+ " ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i>size/2 +1){
                    if(i+j>=size+1){
                        System.out.print(j+ " ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
