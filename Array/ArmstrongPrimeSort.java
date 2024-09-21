import java.util.Scanner;
public class ArmstrongPrimeSort {

    //METHOD TO PRINT ARRAY
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    //METHOD TO SWAP TARGET ARRAY ELEMENTS
    static void swap(int a[], int i, int j){
        int temp= a[i];
        a[i]= a[j];
        a[j]= temp;
    }

    //METHOD TO SORT ARMSTRONG NUMBERS TO THE LEFT AND PRIME NUMBERS TO THE RIGHT
    static void sortArmstrongPrime(int a[]){
        int left=0, right= a.length-1;
        while(left<right){

            //CHECK IF THE LEFT ELEMENT IS ARMSTRONG
            int left_copy= a[left];
            int sum=0;
            while(left_copy>0){
                int rem= left_copy%10;
                sum= sum+(rem*rem*rem);
                left_copy/=10;
            }

            //CHECK IF THE RIGHT ELEMENT IS PRIME
            boolean flag= true;
            int prime=0;
            for(int j=2; j<a[right]; j++){
                if(a[right]%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                prime=a[right];
            }

            //CONDITIONS FOR SORTING ARMSTRONG TO THE LEFT AND PRIME TO THE RIGHT
            if(a[left]==sum){
                left++;
            }
            else if(a[right]==prime){
                right--;
            }
            else{
                swap(a, left, right);
                if(a[left]==sum){
                    left++;
                }
                else if(a[right]==prime){
                    right--;
                }
            }
        }
        display(a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //INPUT ARRAY SIZE AND ELEMENTS
        System.out.print("Enter array size: ");
        int size= sc.nextInt();

        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();                   /*13 153 4 370 11 6*/
        }
        sortArmstrongPrime(arr);
    }
}
