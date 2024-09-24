import java.util.Scanner;
public class ArrayRotation {

    /*input : 1 2 3 4 5 6 7 8 9 10
    rotation :3
    output :8 9 10 1 2 3 4 5 6 7*/

    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void rotateArray(int a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rotations: ");
        int rotate = sc.nextInt();
        while (rotate > 0){
            for (int i = 0; i < a.length; i++) {
                int temp=a[i];
                a[i] = a[a.length - 1];
                a[a.length-1]=temp;
            }
            rotate--;
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
