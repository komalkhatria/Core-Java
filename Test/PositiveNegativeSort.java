import java.util.Scanner;
public class PositiveNegativeSort {

    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void swap(int a[], int i, int j){
        int temp=a[i];
        a[i]= a[j];
        a[j]= temp;
    }
    static void sortArray(int a[]){
        int left=0;
        int right= a.length-1;
        while(left<right){
            if(a[left]<0){
                left++;
            }
            else if(a[right]>0){
                right--;
            }
            else if(a[left]>0 && a[right]<0){
                swap(a, left, right);
                left++;
                right--;
            }
        }
        display(a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length: ");
        int size= sc.nextInt();
        int a[]= new int[size];
        System.out.print("Enter " + size + " integers: ");
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Original array: ");
        display(a);
        sortArray(a);
    }
}
