import java.util.Scanner;
public class ArrayColumnHistogram {
    //METHOD TO PRINT COLUMNED HISTOGRAM OF ARRAY STARTING FROM THE TOP
    static void printHistogram(int a[]){
        int max=0;      //FINDING MAXIMUM ELEMENT FOR THE MAX NO. OF ROWS
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0; i<max; i++){       //OUTER LOOP RUNS TILL THE MAXIMUM ELEMENT LENGTH
            for(int j=0; j<a.length; j++){      //INNER LOOP RUNS TILL THE ARRAY LENGTH

                if(a[j]>0){     //TARGETING EACH ELEMENT OF ARRAY ONCE IN THE INNER LOOP
                    System.out.print("*");      //PRINTING A STAR EVERY TIME THERE IS A VALUE LEFT IN THE ARRAY ELEMENT
                    a[j]-=1;        //UPDATING THE VALUE OF EACH ARRAY ELEMENT BY -1
                }
                else{
                    System.out.print(" ");      //PRINT SPACE EVERY TIME THE VALUE OF ARRAY ELEMENT IS LESS THAN THE MAX ELEMENT VALUE
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //ARRAY SIZE AND ELEMENTS INPUT
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int a[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<size; i++){
            a[i]= sc.nextInt();
        }

        //CALLING THE METHOD TO PRINT TOP-BOTTOM HISTOGRAM PATTERN OF ARRAY
        printHistogram(a);
    }
}
