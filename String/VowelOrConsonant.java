import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        //STRING INPUT
        System.out.print("Enter a string: ");
        String s= sc.nextLine();

        //CONVERT THE STRING TO CHAR ARRAY
        char c[]= s.toCharArray();

        for(int i=0; i<c.length; i++){

            //OUTER IF CHECKS IF THE CHARACTER IS AN ALPHABET OR NOT
            if((c[i]>='a' && c[i]<='z') || (c[i]>='A' && c[i]<='Z')){

                if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'
                        || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U'){
                    System.out.println(c[i] + " - vowel");
                }

                else if(c[i]!='a' && c[i]!='e' && c[i]!='i' && c[i]!='o' && c[i]!='u'
                        && c[i]!='A' && c[i]!='E' && c[i]!='I' && c[i]!='O' && c[i]!='U'){
                    System.out.println(c[i] + " - consonant");
                }
            }

            //SKIP AND MOVE TO NEXT ITERATION IF CURRENT CHARACTER IS NOT AN ALPHABET
            else{
                continue;
            }
        }
    }

}
