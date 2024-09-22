import java.util.Scanner;
public class CheckPalindrome {
    static void checkPalindrome(int a[]){

        for(int i=0; i<a.length; i++){
            int sum=0;
            int count=0;
            int temp= a[i], temp2=a[i];
            while(temp>0){
                temp/=10;
                count++;
            }
            if(count==4){
                while(temp2>0){
                    int rem= temp2%10;
                    sum= sum*10 +rem;
                    temp2/= 10;
                }
                if(sum==a[i]){
                    System.out.print(a[i]+ " ");
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
        checkPalindrome(arr);
    }
}
