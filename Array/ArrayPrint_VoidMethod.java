import java.util.Scanner;
public class ArrayPrint_VoidMethod {
    //VOID METHODS FOR ARRAY PRINTING
    static void displayB(byte b[]){
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
    static void displayS(short s[]){
        for(int i=0; i<s.length; i++){
            System.out.print(s[i] + " ");
        }
    }
    static void displayI(int i1[]){
        for(int i=0; i<i1.length; i++){
            System.out.print(i1[i] + " ");
        }
    }
    static void displayL(long l[]){
        for(int i=0; i<l.length; i++){
            System.out.print(l[i] + " ");
        }
    }
    static void displayF(float f[]){
        for(int i=0; i<f.length; i++){
            System.out.print(f[i] + " ");
        }
    }
    static void displayD(double d[]){
        for(int i=0; i<d.length; i++){
            System.out.print(d[i] + " ");
        }
    }
    static void displayC(char c[]){
        for(int i=0; i<c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
    static void displayBool(boolean bool[]){
        for(int i=0; i<bool.length; i++){
            System.out.print(bool[i] + " ");
        }
    }
    static void displayStr(String str[]){
        for(int i=0; i<str.length; i++){
            System.out.print(str[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //ALL PRIMITIVE DATATYPES ARRAY USING VOID METHOD
        //BYTE
        System.out.print("Enter size for byte array: ");
        int size_b= sc.nextInt();
        byte b[]= new byte[size_b];
        System.out.print("Enter elements for byte array: ");
        for(int i=0; i<b.length; i++){
            b[i]= sc.nextByte();
        }
        displayB(b);
        System.out.println();

        //SHORT
        System.out.print("Enter size for short array: ");
        int size_s= sc.nextInt();
        short s[]= new short[size_s];
        System.out.print("Enter elements for short array: ");
        for(int i=0; i<s.length; i++){
            s[i]= sc.nextShort();
        }
        displayS(s);
        System.out.println();

        //INT
        System.out.print("Enter size for int array: ");
        int size_i= sc.nextInt();
        int i1[]= new int[size_i];
        System.out.print("Enter elements for int array: ");
        for(int i=0; i<i1.length; i++){
            i1[i]= sc.nextInt();
        }
        displayI(i1);
        System.out.println();

        //LONG
        System.out.print("Enter size for long array: ");
        int size_l= sc.nextInt();
        long l[]= new long[size_l];
        System.out.print("Enter elements for long array: ");
        for(int i=0; i<l.length; i++){
            l[i]= sc.nextLong();
        }
        displayL(l);
        System.out.println();

        //FLOAT
        System.out.print("Enter size for float array: ");
        int size_f= sc.nextInt();
        float f[]= new float[size_f];
        System.out.print("Enter elements for float array: ");
        for(int i=0; i<f.length; i++){
            f[i]= sc.nextFloat();
        }
        displayF(f);
        System.out.println();

        //DOUBLE
        System.out.print("Enter size for double array: ");
        int size_d= sc.nextInt();
        double d[]= new double[size_d];
        System.out.print("Enter elements for double array: ");
        for(int i=0; i<d.length; i++){
            d[i]= sc.nextDouble();
        }
        displayD(d);
        System.out.println();

        //CHAR
        System.out.print("Enter size for char array: ");
        int size_c= sc.nextInt();
        char c[]= new char[size_c];
        System.out.print("Enter elements for char array: ");
        for(int i=0; i<c.length; i++){
            c[i]= sc.next().charAt(0);
        }
        displayC(c);
        System.out.println();

        //BOOLEAN
        System.out.print("Enter size for boolean array: ");
        int size_bl= sc.nextInt();
        boolean bool[]= new boolean[size_bl];
        System.out.print("Enter elements for boolean array: ");
        for(int i=0; i<bool.length; i++){
            bool[i]= sc.nextBoolean();
        }
        displayBool(bool);
        System.out.println();

        //STRING
        System.out.print("Enter size for string array: ");
        int size_str= sc.nextInt();
        String str[]= new String[size_str];
        System.out.print("Enter elements for string array: ");
        for(int i=0; i<str.length; i++){
            str[i]= sc.next();
            sc.nextLine();
        }
        displayStr(str);
        System.out.println();
    }
}
