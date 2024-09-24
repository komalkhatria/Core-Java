import java.util.Scanner;

public class ArrayRotation2 {
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void rotateArray(int a[]) {
        Scanner sc = new Scanner(System.in);
        int left=0, right= a.length-1;
        int mid= (left+right)/2;

        System.out.print("Enter no. of rotations for left side: ");
        int rotate_left = sc.nextInt();
        while (rotate_left > 0){
            for (int i = left; i < mid; i++) {
                int temp=a[i];
                a[i] = a[mid];
                a[mid]=temp;
            }
            rotate_left--;
        }

        System.out.print("Enter no. of rotations for right side: ");
        int rotate_right = sc.nextInt();
        while (rotate_right > 0){
            for (int i = mid+1; i < right; i++) {
                int temp=a[i];
                a[i] = a[right];
                a[right]=temp;
            }
            rotate_right--;
        }
        display(a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Original array: ");
        display(arr);
        rotateArray(arr);

    }

}
