import java.util.Scanner;

public class SwapArmstrong {
    //METHOD TO PRINT ARRAY
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    //METHOD TO SWAP TWO NUMBERS OF AN ARRAY
    static void swap(int a[], int i, int j){
        int temp=a[i];
        a[i]= a[j];
        a[j]= temp;
    }
    //METHOD TO FIND FIRST AND LAST ARMSTRONG NUMBERS IN AN ARRAY
    static void findArmstrong(int a[]){
        int first_armstrong=-1, last_armstrong=-1;
        for(int i=0; i<a.length; i++){
            int temp = a[i];
            int sum=0;
            while(temp>0){
                int rem= temp%10;
                sum= sum+ rem*rem*rem;
                temp/=10;
            }
            if(sum==a[i]){
                if(first_armstrong==-1){
                    first_armstrong=i;
                }
                last_armstrong= i;
            }
        }
        swap(a, first_armstrong, last_armstrong);

        //DISPLAY ARRAY AFTER SWAPPING
        display(a);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        findArmstrong(arr);
    }
}
