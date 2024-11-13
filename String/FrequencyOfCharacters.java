import java.util.Scanner;
public class FrequencyOfCharacters {
    static void frequency(char c[]){
        System.out.println("Calculating frequency of characters: ");
        boolean visited[]= new boolean[c.length];

        for(int i=0; i<c.length; i++){
            if (visited[i]== false){

                int count= 1;
                for(int j=i+1; j<c.length; j++){
                    if(c[i]==c[j]){
                        visited[j]= true;
                        count++;
                    }
                }
                System.out.println(c[i] + " - " + count );
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

        frequency(c);
    }
}
