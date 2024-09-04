import java.util.Scanner;
public class ReverseArraySpecificPart {

    //METHOD TO REVERSE ARRAY FROM USER INPUT STARTING AND ENDING POINT
    static void reverseArray(int arr[], int start, int end){
        for(int i=0; i<arr.length; i++){
            if(i==start){
                for(int j=end; j>=start; j--){
                    System.out.print(arr[j] + " ");
                }
                i= end+1;
            }
                System.out.print(arr[i] + " ");
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

        System.out.println("Let's reverse array!");
        System.out.print("Enter starting point: ");
        int start= sc.nextInt();
        System.out.print("Enter ending point: ");
        int end= sc.nextInt();
        reverseArray(arr, start, end);
    }
}
