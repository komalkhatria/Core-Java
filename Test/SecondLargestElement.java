import java.util.Scanner;
public class SecondLargestElement {

    static void secondLargest(int a[]){
        int max=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int second_max=0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=max){
                if(a[i]>second_max){
                    second_max=a[i];
                }
            }
        }
        System.out.println("Second maximum number is " + second_max);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        secondLargest(arr);
    }

}
