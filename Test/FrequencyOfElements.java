import java.util.Scanner;
public class FrequencyOfElements {
    static void elementFrequency(int a[]){
        for(int i=0; i<a.length; i++){
            int count=1;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            System.out.println(a[i] + ": " + count);
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
        elementFrequency(a);
    }
}
