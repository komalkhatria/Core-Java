import java.util.Scanner;
public class DuplicateElement {
    static void findDuplicateElements(int arr[]){
        boolean visited[]= new boolean[arr.length];

        for(int i=0; i<arr.length; i++){
            //SKIP IF ELEMENT IS ALREADY CHECKED
            if(visited[i]){
                continue;
            }

            int count=0, first_index=0, last_index=0;
            for(int j=i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j]=true;    //MARK THIS ELEMENT AS CHECKED
                    count++;
                    last_index=j;
                    System.out.print(j+ " ");
                }
            }

            if(count>0){
                System.out.println("(Index position), " + arr[i] + " duplicates " + count + " times");
                System.out.println("First Index: " + i);
                System.out.println("Last Index: " + last_index);
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        findDuplicateElements(arr);

    }
}
