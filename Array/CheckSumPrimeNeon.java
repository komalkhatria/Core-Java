import java.util.Scanner;

public class CheckSumPrimeNeon {

    //METHOD TO CHECK IF THE SUM OF FIRST HALF OF THE ARRAY IS A PRIME NUMBER OR NOT
    static void checkSumPrime(int a[]){
        int sum=0;
        for(int i=0; i<a.length/2; i++){
            sum+=a[i];
        }
        System.out.println("Sum= " + sum);
        int flag=0;
        for(int i=2; i<sum; i++){
            if(sum%i==0){       //PRIME NUMBER IS ONLY DIVISIBLE BY 1 AND ITSELF
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime");
        }
    }

    //METHOD TO CHECK IF THE SUM OF SECOND HALF OF THE ARRAY IS A NEON NUMBER OR NOT
    static void checkSumNeon(int a[]){
        int sum=0;
        for(int i=a.length/2 ; i<a.length; i++){
            sum+=a[i];
        }
        System.out.println("Sum= " + sum);
        int neonProduct= sum*sum;
        int neon=0;
        while(neonProduct>0){
            neon+= neonProduct%10;      //NEON NUMBER IS THE SUM OF DIGITS OF PRODUCT OF THE NUMBER
            neonProduct/=10;
        }
        if(neon==sum){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not a neon number");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        checkSumPrime(arr);
        checkSumNeon(arr);
    }
}
