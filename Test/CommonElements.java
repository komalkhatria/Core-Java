import java.util.Scanner;
public class CommonElements {

    static void commonElements(int a[], int b[]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1= sc.nextInt();
        int arr1[]= new int[size1];
        System.out.print("Enter " + size1 + " elements: ");
        for(int i=0; i<arr1.length; i++){
            arr1[i]= sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2= sc.nextInt();
        int arr2[]= new int[size2];
        System.out.print("Enter " + size2 + " elements: ");
        for(int i=0; i<arr1.length; i++){
            arr2[i]= sc.nextInt();
        }
        System.out.print("Common elements: ");
        commonElements(arr1, arr2);
    }
}
