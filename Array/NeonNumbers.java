import java.util.Scanner;
public class NeonNumbers {

    //METHOD TO PRINT NEON NUMBERS OF AN ARRAY
    static void neonNumber(int a[]){
        for(int i=0; i<a.length; i++){
            int sum=0, temp=a[i]*a[i];
            int temp1=temp;
            while(temp>0){
                sum+= temp%10;
                temp= temp/10;
            }
            if(sum*sum==temp1){
                System.out.println(a[i] + " ");
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
        System.out.println("Neon numbers of the array are: ");
        neonNumber(arr);
    }
}