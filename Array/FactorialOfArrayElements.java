import java.util.Scanner;
public class FactorialOfArrayElements {

    //METHOD TO PRINT FACTORIAL OF ARRAY ELEMENTS
    static void factorial(int a[]){
        for(int i=0; i<a.length; i++){
            int fact=1;
            for(int f=1; f<=a[i]; f++){
                fact*= f;
            }
            System.out.print(fact + "  ");
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
        System.out.println("Factorial array: ");
        factorial(arr);
    }
}
