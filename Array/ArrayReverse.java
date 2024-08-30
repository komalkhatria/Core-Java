public class ArrayReverse {
    public static void main(String args[]){
        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //PRINT PATTERN 1 (REVERSE)
        for(int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //PRINT PATTERN 2
        for(int i= 0; i<arr.length/2; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i= arr.length-1; i>= arr.length/2; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //PRINT PATTERN 3
        for(int i= arr.length/2-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        for(int i= arr.length/2; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //PRINT PATTERN 4
        for(int i= arr.length/2-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        for(int i= arr.length-1; i>= arr.length/2; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
