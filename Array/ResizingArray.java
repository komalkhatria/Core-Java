import java.util.Scanner;
public class ResizingArray {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //STRING WRAPPER CLASS
        System.out.print("Enter size for string array: ");
        int size_str= sc.nextInt();
        String str[]= new String[size_str];

        System.out.print("Enter elements for string array: ");
        for(int i=0; i<str.length; i++){
            str[i]= sc.next();
        }
        for(int i=0; i<str.length; i++){
            System.out.print(str[i] + " ");
        }
        System.out.println();

        //RESIZING ARRAY
        System.out.print("Enter new size for the array: ");
        size_str= sc.nextInt();
        str= new String[size_str];

        //INPUT NEW ELEMENTS AS ARRAY SIZE IS UPDATED AND NEW
        System.out.print("Enter new elements for the string array: ");
        for(int i=0; i<str.length; i++){
            str[i]= sc.next();
        }

        //PRINTING UPDATED SIZED ARRAY
        for(int i=0; i<str.length; i++){
            System.out.print(str[i] + " ");
        }
        System.out.println();

        //ArrayIndexOutOfBoundsException ERROR AS ARRAY SIZE IS NO MORE 5, IT IS 3 NOW
        System.out.println(str[4]);
    }
}
