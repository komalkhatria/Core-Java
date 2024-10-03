import java.util.Scanner;

public class IntersectionOfArrays {
    static void intersection(int a[], int b[]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));

        System.out.print("Enter size of first array: ");
        int size1= sc.nextInt();
        int a[]= new int[size1];
        System.out.print("Enter " + size1 + " numbers: ");
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2= sc.nextInt();
        int b[]= new int[size2];
        System.out.print("Enter " + size2 + " numbers: ");
        for(int i=0; i<a.length; i++){
            b[i]= sc.nextInt();
        }

        intersection(a, b);
    }
}
