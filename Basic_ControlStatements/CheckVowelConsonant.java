import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch;
        System.out.print("Enter an alphabet: ");
        ch= sc.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println(ch + " is a vowel");
            }
            else{
                System.out.println(ch + " is a consonant");
            }
        }
        else{
            System.out.println(ch + " is not an alphabet");
        }

    }
}
