import java.util.Scanner;
public class IsItPalindrome {

    static void checkIfPalindrome(int a[]){
        int copy[]= new int[a.length];
        for(int i=0; i<a.length; i++){
            copy[i]= a[a.length-1-i];
        }
        for(int i=0; i<copy.length; i++){
            System.out.print(copy[i] + " ");
        }
        System.out.println();

        boolean flag=true;
        for(int i=0; i<a.length; i++){
            if(a[i]!=copy[i]){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Array is a palindrome");
        }
        else{
            System.out.println("Array is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size= sc.nextInt();

        int a[]= new int[size];
        System.out.print("Enter " + size + " elements: ");
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }
        checkIfPalindrome(a);
    }
}
