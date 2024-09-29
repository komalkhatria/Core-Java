import java.util.Scanner;
public class IsItPalindrome {

    static void checkPalindrome(int a[]){
        //CREATING A NEW ARRAY TO COMPARE WITH GIVEN ARRAY
        int copy[]= new int[a.length];
        for(int i=0; i<a.length; i++){
            copy[i]=a[a.length -1 -i];      //STORING ELEMENTS OF GIVEN ARRAY IN REVERSE ORDER
        }

        //DISPLAY COPY ARRAY
        System.out.print("Copy array: ");
        for(int i=0; i<a.length; i++){
            System.out.print(copy[i] + " ");
        }
        System.out.println();

        //CHECK IF EACH ELEMENT OF GIVEN ARRAY MATCHES EACH ELEMENT OF COPY ARRAY WHICH STORES REVERSE ELEMENTS
        boolean flag=true;
        for(int i=0; i<a.length; i++){
            if(a[i]!=copy[i]){
                flag= false;
                break;
            }
        }
        if (flag==true){        //IF REVERSE ELEMENTS MATCH ORIGINAL ELEMENTS, THEN PALINDROME
            System.out.println("Given array is palindrome");
        }
        else{
            System.out.println("Given array is not a palindrome");
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        checkPalindrome(arr);
    }
}
