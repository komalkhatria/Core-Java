interface ByteCalculator{
    byte add(byte a, byte b);
}
class MyCalculator implements ByteCalculator{
    public byte add(byte a, byte b){
        byte sum= (byte)(a+b);
        return sum;
    }
}

public class UseOfInterface {
    public static void main(String[] args) {
        MyCalculator c1= new MyCalculator();
        System.out.println("Byte sum: " + c1.add((byte)2, (byte)4));

    }
}
