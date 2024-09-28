import java.util.Scanner;
public class CountVowels {

    static void countVowels(char ch[]){
        int count=0;
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                count++;
            }
        }
        System.out.print("No. of vowels in the array= " + count);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int size= sc.nextInt();
        char ch[]= new char[size];
        System.out.print("Enter " + size + " characters: ");
        for(int i=0; i<ch.length; i++){
            ch[i]= sc.next().charAt(0);
        }
        countVowels(ch);
    }
}
