import java.util.Scanner;
public class DuplicateCharacter {

    static void checkDuplicates(char c[]){
        boolean visited[]= new boolean[c.length];
        for(int i=0; i<c.length; i++){
            if (visited[i]== false){
                int count= 0;
                for(int j=i+1; j<c.length; j++){
                    if(c[i]==c[j]){
                        visited[j]= true;
                        count++;
                        System.out.print(j + " ");
                    }
                }
                if(count>0){
                    System.out.println("," + c[i] + " duplicates " + count + " times");
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

        checkDuplicates(c);
    }
}