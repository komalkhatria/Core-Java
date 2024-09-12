import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    static void searchElement(int a[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Search: ");
        int target= sc.nextInt();
        int li= 0;
        int hi= a.length-1;
        int mid= (li+hi)/2;
        while(li<=hi){
            if(a[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(a[mid]<target){
                li=mid+1;
            }
            else if(a[mid]>target){
                hi=mid-1;
            }
            mid= (li+hi)/2;
        }
    }

    static void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //INPUT ARRAY SIZE AND ELEMENTS
        System.out.print("Enter array size: ");
        int size= sc.nextInt();

        int arr[]= new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);
        display(arr);
        System.out.println();
        searchElement(arr);
    }
}
