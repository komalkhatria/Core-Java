import java.util.Scanner;
public class PairSum {
    static void findPairs(int a[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter target sum: ");
        int target= sc.nextInt();
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]+ a[j]==target){
                    System.out.println(a[i] + ", " + a[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size= sc.nextInt();

        int a[]= new int[size];
        System.out.print("Enter " + size + " elements: ");
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }
        findPairs(a);
    }
}
