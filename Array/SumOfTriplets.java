import java.util.Scanner;
public class SumOfTriplets {

    //METHOD TO FIND TRIPLETS WHICH SUM UP TO A TARGET NUMBER
    static void sumOfTriplets(int a[], int target){
        for(int i=0; i<a.length; i++){
            for(int j= i+1; j<a.length; j++){
                for(int k=j+1; k<a.length; k++){
                    if(a[i] + a[j] + a[k] ==target){
                        System.out.println("Index: " + i + "," + j + "," + k + " Elements: " + a[i] + "," + a[j] + "," + a[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter a number to find the three elements from the array which sum up to that number: ");
        int target= sc.nextInt();
        sumOfTriplets(arr, target);
    }
}
