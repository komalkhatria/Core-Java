import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s= sc.nextLine();

        //PRINTING ORIGINAL STRING
        char c[]= s.toCharArray();
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]);
        }
        System.out.println();

        //METHOD 1: REVERSE STRING
        String str="";
        char ch;
        for(int i=c.length-1; i>=0; i--){
            ch= s.charAt(i);
            str+=ch;
        }
        System.out.println(str);


        //METHOD2: REVERSE STRING
        String str2="";
        char c2[]= new char[c.length];
        for(int i=0; i<c2.length; i++){
            c2[i]= c[c.length-i-1];
            str2= str2 + c2[i];
        }
        System.out.println(str2);

    }
}
