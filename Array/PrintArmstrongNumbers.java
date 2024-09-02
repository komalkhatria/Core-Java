import java.util.Scanner;
import java.lang.Math;
public class PrintArmstrongNumbers {

    //METHOD TO PRINT ARMSTRONG NUMBERS OF AN ARRAY
    static void armstrong(int a[]){
        for(int i=0; i<a.length; i++){
            int sum=0, rem=0;
            int a1=a[i];
            while(a[i]>0){
                rem= a[i]%10;
                sum= sum+ rem*rem*rem;
                a[i]= a[i]/10;
            }

            if(sum==a1){
                System.out.println(sum);
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
        armstrong(arr);
    }
}
