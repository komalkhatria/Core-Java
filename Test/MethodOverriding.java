class Calculator{
    short calculate(short a, short b){
        short sum= (short)(a+b);
        return sum;
    }
}
class AdvancedCalculator extends Calculator{
    short calculate(short a, short b){
        System.out.println("Sum: " + super.calculate((short)2, (short)3));
        short product= (short)(a*b);
        return product;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        AdvancedCalculator c1= new AdvancedCalculator();
        System.out.println("Product: " + c1.calculate((short)4, (short)6));
    }
}
