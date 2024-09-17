import java.util.Scanner;

public class ArrayPattern {
    static void display(int a[]){
        int max=0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    max=a[i];
                }
                else{
                    max= a[j];
                }
            }
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<=max; j++){
                while(j<a[i]){
                    System.out.print("*");
                    j++;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //INPUT ARRAY SIZE AND ELEMENTS
        System.out.print("Enter a number: ");
        int size= sc.nextInt();

        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers(0-9): ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        display(arr);
    }
}
