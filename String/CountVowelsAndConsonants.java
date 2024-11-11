import java.util.Scanner;
public class CountVowelsAndConsonants
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //STRING INPUT
        System.out.print("Enter a string: ");
        String s= sc.nextLine();

        //CONVERT THE STRING TO CHAR ARRAY
        char c[]= s.toCharArray();

        int vCount=0, cCount=0;     //INITIALISING VOWEL AND CONSONANT COUNT WITH 0
        for(int i=0; i<c.length; i++){

            //OUTER IF CHECKS IF THE CHARACTER IS AN ALPHABET OR NOT
            if((c[i]>='a' && c[i]<='z') || (c[i]>='A' && c[i]<='Z')){

                if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'
                        || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U'){
                    vCount++;
                }

                else if(c[i]!='a' && c[i]!='e' && c[i]!='i' && c[i]!='o' && c[i]!='u'
                        && c[i]!='A' && c[i]!='E' && c[i]!='I' && c[i]!='O' && c[i]!='U'){
                    cCount++;
                }
            }

            //SKIP AND MOVE TO NEXT ITERATION IF CURRENT CHARACTER IS NOT AN ALPHABET
            else{
                continue;
            }
        }

        System.out.println("No. of vowels: " + vCount);
        System.out.println("No. of consonants: " + cCount);

        if(vCount>cCount){
            System.out.println("Vowels are more");
        }
        else if (cCount>vCount){
            System.out.println("Consonants are more");
        }
        else{
            System.out.println("Both vowels and consonants are equal");
        }
    }
}