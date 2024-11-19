import java.util.Scanner;
public class WordPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //STRING INPUT
        System.out.print("Enter a string: ");
        String s= sc.nextLine();

        String str[]= s.split(" ");
        String str2[]= new String[str.length];

        //STORING THE REVERSED SENTENCE IN ANOTHER STRING ARRAY
        for(int i=0; i<str.length; i++){
            str2[i]= str[str.length-i-1];
        }

        //CHECK IF WORDS OF ORIGINAL STRING EQUALS THE REVERSED ONE
        boolean flag=true;
        for(int i=0; i<str.length; i++){
            if(str[i].equals(str2[i])==false){
                flag= false;
                break;
            }
        }
        if(flag==true){
            System.out.print("The string is a palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}