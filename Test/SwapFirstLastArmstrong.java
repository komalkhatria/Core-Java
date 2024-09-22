import java.util.Arrays;
import java.util.Scanner;

public class SwapFirstLastArmstrong {
    static void swapArmstrong(int arr[]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            int count=i;
            int temp=arr[i];
            int sum=0;
            while(temp>0){
                int rem= temp%10;
                sum+= rem*rem*rem;
                temp/= 10;
            }
            if(sum==arr[i]){
                System.out.print(arr[i] + " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        swapArmstrong(arr);
    }
}




/*public class SwapFirstLastArmstrong {
    static void swapArmstrong(int arr[]){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            int count=i;
            int temp=arr[i];
            int sum=0;
            while(temp>0){
                int rem= temp%10;
                sum+= rem*rem*rem;
                temp/= 10;
            }
            if(sum==arr[i]){
                System.out.print(arr[i] + " ");
                int lastArmstrong= i;

            }
            if(sum==arr[i]){
                int firstArmstrong= i;
                break;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        swapArmstrong(arr);
    }
}*/
