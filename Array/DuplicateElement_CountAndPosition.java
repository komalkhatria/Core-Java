import java.util.Scanner;

public class DuplicateElement_CountAndPosition {
    //METHOD TO COUNT OCCURRENCE OF TARGET ELEMENT, PRINT ITS INDEX POSITIONS AND FIRST AND LAST POSITION OF ITS OCCURRENCE
    static void countAndPosition(int arr[], int target){
        int count=0, pos=0;
        System.out.print("Positions at which " + target + " occurred= ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
                pos= i;
                System.out.print(pos+ " ");
            }
        }

        System.out.println();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("First position= " + i);
                break;
            }
        }

        System.out.println("No. of times " + target + " occurred= " + count);
        System.out.println("Last position= " + pos);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number to count its occurrence and return position: ");
        int target= sc.nextInt();
        countAndPosition(arr, target);
    }
}
