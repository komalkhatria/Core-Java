import java.util.Scanner;
public class ShallowCopy {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //ARRAY ELEMENTS INPUT
        int a[]= new int[5];
        System.out.print("Enter five int array elements: ");
        for(int i=0; i<5; i++){
            a[i]= sc.nextInt();
        }

        //SHALLOW COPY
        int b[]= a;
        int c[]= b;
        int d[]= c;
        int e[]= d;

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
        System.out.print("Update value of 3rd element of array d: ");
        d[2]= sc.nextInt();

        //ARRAYS AFTER VALUE UPDATE IN ARRAY-d
        //CHANGES IN ARRAY-d WILL BE REFLECTED IN ALL OTHER SHALLOW COPY ARRAYS
        System.out.println();
        System.out.println("Updated shallow copy arrays: ");
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
