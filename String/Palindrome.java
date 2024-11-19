import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //STRING INPUT
        System.out.print("Enter a string: ");
        String s= sc.next();

        char ch[]= s.toCharArray();
        char ch2[]= new char[ch.length];

        //STORING THE REVERSED STRING IN ANOTHER CHAR ARRAY
        for(int i=0; i<ch.length; i++){
            ch2[i]= ch[ch.length-i-1];
        }

        //CHECK IF CHARACTERS OF ORIGINAL STRING EQUALS THE REVERSED ONE
        boolean flag=true;
        for(int i=0; i<ch.length; i++){
            if(ch[i]!=ch2[i]){
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
