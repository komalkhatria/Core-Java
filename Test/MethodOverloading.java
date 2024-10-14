class Overload{
    void addnumbers(short n){
        System.out.print("Short value: ");
        System.out.println(n);
    }
    void addNumbers(byte n1, byte n2){
        System.out.print("Byte addition: ");
        System.out.println(n1+n2);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Overload o= new Overload();
        o.addnumbers((short)15);
        o.addNumbers((byte)4, (byte)7);
    }
}
