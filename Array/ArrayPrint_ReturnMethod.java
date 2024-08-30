import java.util.Scanner;
public class ArrayPrint_ReturnMethod {

    //RETURN TYPE METHODS FOR ARRAY STORING
    static byte[] arrayB(byte b[]){
        return b;
    }
    static void displayB(byte b1[]){
        for(int i=0; i<b1.length; i++){
            System.out.print(b1[i] + " ");
        }
    }
    static short[] arrayS(short s[]){
        return s;
    }
    static void displayS(short s1[]){
        for(int i=0; i<s1.length; i++){
            System.out.print(s1[i] + " ");
        }
    }
    static int[] arrayI(int i1[]){
        return i1;
    }
    static void displayI(int i2[]){
        for(int i=0; i<i2.length; i++){
            System.out.print(i2[i] + " ");
        }
    }
    static long[] arrayL(long l[]){
        return l;
    }
    static void displayL(long l1[]){
        for(int i=0; i<l1.length; i++){
            System.out.print(l1[i] + " ");
        }
    }
    static float[] arrayF(float f[]){
        return f;
    }
    static void displayF(float f1[]){
        for(int i=0; i<f1.length; i++){
            System.out.print(f1[i] + " ");
        }
    }
    static double[] arrayD(double d[]){
        return d;
    }
    static void displayD(double d1[]){
        for(int i=0; i<d1.length; i++){
            System.out.print(d1[i] + " ");
        }
    }
    static char[] arrayC(char c[]){
        return c;
    }
    static void displayC(char c1[]){
        for(int i=0; i<c1.length; i++){
            System.out.print(c1[i] + " ");
        }
    }
    static boolean[] arrayBool(boolean bool[]){
        return bool;
    }
    static void displayBool(boolean bool[]){
        for(int i=0; i<bool.length; i++){
            System.out.print(bool[i] + " ");
        }
    }
    static String[] arrayStr(String str[]){
        return str;
    }
    static void displayStr(String str[]) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        //ALL PRIMITIVE DATATYPES ARRAY STORING USING RETURN TYPE METHOD
        //BYTE
        System.out.print("Enter size for byte array: ");
        int size_b= sc.nextInt();
        byte b[]= new byte[size_b];
        System.out.print("Enter elements for byte array: ");
        for(int i=0; i<b.length; i++){
            b[i]= sc.nextByte();
        }
        byte b1[]= arrayB(b);
        displayB(b1);
        System.out.println();

        //SHORT
        System.out.print("Enter size for short array: ");
        int size_s= sc.nextInt();
        short s[]= new short[size_s];
        System.out.print("Enter elements for short array: ");
        for(int i=0; i<s.length; i++){
            s[i]= sc.nextShort();
        }
        short s1[]= arrayS(s);
        displayS(s1);
        System.out.println();

        //INT
        System.out.print("Enter size for int array: ");
        int size_i= sc.nextInt();
        int i1[]= new int[size_i];
        System.out.print("Enter elements for int array: ");
        for(int i=0; i<i1.length; i++){
            i1[i]= sc.nextInt();
        }
        int i2[]= arrayI(i1);
        displayI(i2);
        System.out.println();

        //LONG
        System.out.print("Enter size for long array: ");
        int size_l= sc.nextInt();
        long l[]= new long[size_l];
        System.out.print("Enter elements for long array: ");
        for(int i=0; i<l.length; i++){
            l[i]= sc.nextLong();
        }
        long l1[]= arrayL(l);
        displayL(l1);
        System.out.println();

        //FLOAT
        System.out.print("Enter size for float array: ");
        int size_f= sc.nextInt();
        float f[]= new float[size_f];
        System.out.print("Enter elements for float array: ");
        for(int i=0; i<f.length; i++){
            f[i]= sc.nextFloat();
        }
        float f1[]= arrayF(f);
        displayF(f1);
        System.out.println();

        //DOUBLE
        System.out.print("Enter size for double array: ");
        int size_d= sc.nextInt();
        double d[]= new double[size_d];
        System.out.print("Enter elements for double array: ");
        for(int i=0; i<d.length; i++){
            d[i]= sc.nextDouble();
        }
        double d1[]= arrayD(d);
        displayD(d1);
        System.out.println();

        //CHAR
        System.out.print("Enter size for char array: ");
        int size_c= sc.nextInt();
        char c[]= new char[size_c];
        System.out.print("Enter elements for char array: ");
        for(int i=0; i<c.length; i++){
            c[i]= sc.next().charAt(0);
        }
        char c1[]= arrayC(c);
        displayC(c1);
        System.out.println();

        //BOOLEAN
        System.out.print("Enter size for boolean array: ");
        int size_bl= sc.nextInt();
        boolean bool[]= new boolean[size_bl];
        System.out.print("Enter elements for boolean array: ");
        for(int i=0; i<bool.length; i++){
            bool[i]= sc.nextBoolean();
        }
        boolean bool1[] = arrayBool(bool);
        displayBool(bool1);
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
        String str1[] = arrayStr(str);
        displayStr(str1);
        System.out.println();

    }
}
