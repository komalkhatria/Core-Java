import java.util.Scanner;

public class TripletPairSum {
    static void checkSum(int a[], int target){
        int count=0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                for(int k=j+1; k<a.length; k++){
                    if(a[i] + a[j] + a[k] ==target){
                        count++;
                        System.out.println("Index: " + i + ", " + j + ", " + k + " ,Element: " + a[i] + ", " + a[j] + ", " + a[k]);
                    }
                }
            }
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
        System.out.print("Enter target sum: ");
        int target= sc.nextInt();
        checkSum(arr, target);
    }
}
