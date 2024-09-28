import java.util.Scanner;
public class MostFrequentElement {
    static void mostFrequent(int a[]){
        int max_count=0;
        int most_frequent=0;
        for(int i=0; i<a.length; i++){
            int count=0;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>max_count){
                max_count=count;
                most_frequent=a[i];
            }
        }
        System.out.print("Most frequent element= " + most_frequent);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        System.out.print("Enter size of array: ");
        int size= sc.nextInt();
        int a[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }

        mostFrequent(a);
    }
}
