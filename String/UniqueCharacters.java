import java.util.Scanner;
public class UniqueCharacters {
    static void checkUnique(char c[]){
        boolean visited[]= new boolean[c.length];

        int uniqueCount= 0;
        for(int i=0; i<c.length; i++){
            if (visited[i]== false){
                int count= 0;
                for(int j=i+1; j<c.length; j++){
                    if(c[i]==c[j]){
                        visited[j]= true;
                        count++;
                    }
                }
                if(count==0){
                    System.out.print(c[i] + " - ");
                    System.out.print(i + "\n");
                    uniqueCount++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //STRING INPUT
        System.out.print("Enter a string: ");
        String s= sc.nextLine();

        //CONVERT THE STRING TO CHAR ARRAY
        char c[]= s.toCharArray();

        checkUnique(c);
    }
}
