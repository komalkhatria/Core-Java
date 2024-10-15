/*CASE 3:
    Parent class method: throws Unchecked Exception
    Child class method: throws Exception, not valid for overriding

    The child method cannot throw broader checked exceptions than the parent method.
    Compile-time error
*/

class Parent3{
    void msg() throws ArithmeticException{
        System.out.println("Parent method");
    }
}
public class TestExceptionChild3 extends Parent3{
    void msg() throws Exception{
        super.msg();
        System.out.println("Child method");
    }
    public static void main(String[] args) {
        TestExceptionChild3 t= new TestExceptionChild3();
        try{
            t.msg();
        }
        catch(Exception e){

        }
    }
}