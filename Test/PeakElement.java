import java.util.Scanner;
public class PeakElement {
    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void peakElements(int a[]){
        int left=0;
        int right=left+2;

        for(int j=1; j<a.length-1; j++){
                if(a[j]>a[left] && a[j]>a[right]){
                    System.out.print(a[j] + " ");
                }
                left++;
                right++;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length: ");
        int size= sc.nextInt();
        int a[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Original array: ");
        display(a);
        System.out.print("Peak elements: ");
        peakElements(a);
    }
}
