import java.util.Scanner;
public class DuplicateElement {

    //COUNT NO. OF DUPLICATES OF TARGET ELEMENT
    static void findDuplicateElements(int arr[], int target){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                for(int j=i+1; j<arr.length; j++){
                        if(arr[j]==target){
                            count++;
                        }
                }
                break;
            }
        }
        System.out.println("Number of duplicates: " + count);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number to check its duplicates: ");
        int target= sc.nextInt();
        findDuplicateElements(arr, target);
    }
}
