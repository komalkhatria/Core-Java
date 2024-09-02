import java.util.Scanner;
public class DeepCopy {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //ARRAY ELEMENTS INPUT
        int a[]= new int[5];
        System.out.print("Enter five int array elements: ");
        for(int i=0; i<5; i++){
            a[i]= sc.nextInt();
        }

        //DEEP COPY
        int b[]= a.clone();
        int c[]= b.clone();
        int d[]= c.clone();
        int e[]= d.clone();

        System.out.print("a= ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("b= ");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.print("c= ");
        for(int i=0; i<c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();

        System.out.print("d= ");
        for(int i=0; i<d.length; i++){
            System.out.print(d[i] + " ");
        }
        System.out.println();

        System.out.print("e= ");
        for(int i=0; i<e.length; i++){
            System.out.print(e[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.print("Update value of 2nd element of array c: ");
        c[1]= sc.nextInt();

        //ARRAYS AFTER VALUE UPDATE IN ARRAY-c
        //CHANGES IN ARRAY-c WILL NOT REFLECT IN OTHER DEEP COPY ARRAYS
        System.out.println();
        System.out.println("Updated deep copy arrays: ");
        System.out.print("a= ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("b= ");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.print("c= ");
        for(int i=0; i<c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();

        System.out.print("d= ");
        for(int i=0; i<d.length; i++){
            System.out.print(d[i] + " ");
        }
        System.out.println();

        System.out.print("e= ");
        for(int i=0; i<e.length; i++){
            System.out.print(e[i] + " ");
        }
        System.out.println();
    }
}
