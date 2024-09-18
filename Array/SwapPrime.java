import java.util.Scanner;
public class SwapPrime{
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
    //METHOD TO FIND FIRST AND LAST PRIME NUMBERS IN AN ARRAY
    static void findPrime(int a[]){
        int first_prime=-1, last_prime=-1;
        for(int i=0; i<a.length; i++){
            int flag=0;
            for(int j=2; j<a[i]; j++){
                if(a[i]%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                if(first_prime==-1){
                    first_prime= i;
                }
                last_prime=i;
            }
        }
        swap(a, first_prime, last_prime);

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
        findPrime(arr);
    }
}
