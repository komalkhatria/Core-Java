import java.util.Scanner;
public class DynamicArray {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //CREATING AND PRINTING DYNAMIC ARRAY

        //PRIMITIVE DATATYPES
        System.out.print("Enter size for byte array: ");
        int size_b= sc.nextInt();
        byte b[]= new byte[size_b];
        System.out.print("Enter elements for byte array: ");
        for(int i=0; i<b.length; i++){
            b[i]= sc.nextByte();
        }
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.print("Enter size for short array: ");
        int size_s= sc.nextInt();
        short s[]= new short[size_s];
        System.out.print("Enter elements for short array: ");
        for(int i=0; i<s.length; i++){
            s[i]= sc.nextShort();
        }
        for(int i=0; i<s.length; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println();

        System.out.print("Enter size for int array: ");
        int size_i= sc.nextInt();
        int i1[]= new int[size_i];
        System.out.print("Enter elements for int array: ");
        for(int i=0; i<i1.length; i++){
            i1[i]= sc.nextInt();
        }
        for(int i=0; i<i1.length; i++){
            System.out.print(i1[i] + " ");
        }
        System.out.println();

        System.out.print("Enter size for long array: ");
        int size_l= sc.nextInt();
        long l[]= new long[size_l];
        System.out.print("Enter elements for long array: ");
        for(int i=0; i<l.length; i++){
            l[i]= sc.nextLong();
        }
        for(int i=0; i<l.length; i++){
            System.out.print(l[i] + " ");
        }
        System.out.println();

        System.out.print("Enter size for float array: ");
        int size_f= sc.nextInt();
        float f[]= new float[size_f];
        System.out.print("Enter elements for float array: ");
        for(int i=0; i<f.length; i++){
            f[i]= sc.nextFloat();
        }
        for(int i=0; i<f.length; i++){
            System.out.print(f[i] + " ");
        }
        System.out.println();

        System.out.print("Enter size for double array: ");
        int size_d= sc.nextInt();
        double d[]= new double[size_d];
        System.out.print("Enter elements for double array: ");
        for(int i=0; i<d.length; i++){
            d[i]= sc.nextDouble();
        }
        for(int i=0; i<d.length; i++){
            System.out.print(d[i] + " ");
        }
        System.out.println();

        System.out.print("Enter size for char array: ");
        int size_c= sc.nextInt();
        char c[]= new char[size_c];
        System.out.print("Enter elements for char array: ");
        for(int i=0; i<c.length; i++){
            c[i]= sc.next().charAt(0);
        }
        for(int i=0; i<c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();



        //STRING WRAPPER CLASS
        System.out.print("Enter size for string array: ");
        int size_str= sc.nextInt();
        String s[]= new String[size_str];
        System.out.print("Enter elements for string array: ");
        for(int i=0; i<s.length; i++){
            s[i]= sc.next();
        }
        for(int i=0; i<s.length; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}
