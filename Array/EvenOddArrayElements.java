import java.util.Scanner;
public class EvenOddArrayElements {
    static int[] fetch(int a[]){
        return a;
    }

    //PRINTING EVEN ELEMENTS OF ARRAY AND THEIR SUM
    static void evenElements(int a[]){
        int sum=0;
        System.out.print("Even numbers: ");
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                System.out.print(a[i] + " ");
                sum+=a[i];
            }
        }
        System.out.println("\nSum of even numbers: " + sum);
    }
    //PRINTING ODD ELEMENTS OF ARRAY AND THEIR SUM
    static void oddElements(int a[]){
        int sum=0;
        System.out.print("Odd numbers: ");
        for(int i=0; i<a.length; i++){
            if(a[i]%2==1){
                System.out.print(a[i] + " ");
                sum+=a[i];
            }
        }
        System.out.println("\nSum of odd numbers: " + sum);
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

        //METHODS CALLED TO FIND EVEN AND ODD ELEMENTS
        int a[]= fetch(arr);
        evenElements(a);
        oddElements(a);

    }
}
