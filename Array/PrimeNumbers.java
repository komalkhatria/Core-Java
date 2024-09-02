import java.util.Scanner;
public class PrimeNumbers {

    //METHOD TO FIND PRIME NUMBERS IN AN ARRAY
    static void primeNumbers(int a[]){
        for(int i=0; i<a.length; i++){
            int flag=0;
            for(int p=2; p<a[i]; p++){
                if(a[i]%p==0){
                    flag=1;
                    break;
                }
                if(flag==0){
                    System.out.print(a[i] + "  ");
                    break;
                }
            }
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
        System.out.println("Prime numbers of the array are: ");
        primeNumbers(arr);
    }
}
