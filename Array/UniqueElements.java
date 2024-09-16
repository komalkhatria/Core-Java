import java.util.Scanner;
public class UniqueElements {
    //METHOD TO PRINT UNIQUE ELEMENTS OF AN ARRAY
    static void printUniqueElements(int arr[]){
        boolean visited[]= new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            if(visited[i]){     //SKIP THE VISITED DUPLICATE
                continue;
            }
            boolean flag= false;        //MARKS UNIQUE ELEMENTS
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    flag=true;
                }
            }
            if(flag==false){
                System.out.print(arr[i] + " ");
            }
        }
    }

    //METHOD TO PRINT ARRAY
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

        //ORIGINAL ARRAY DECLARATION AND DEFINITION (through user input)
        int arr[]= new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Original array: ");
        display(arr);   //CALLING METHOD THAT PRINTS ARRAY
        System.out.println();

        System.out.print("Array (only unique elements): ");
        printUniqueElements(arr);  //ARRAY AFTER DUPLICATE ELEMENTS DELETION
    }
}
