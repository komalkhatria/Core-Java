/*CASE 4:
    Parent class method: throws Unchecked Exception
    Child class method: also throws Unchecked Exception, valid for overriding

    There is no strict requirement for a try-catch block in this case
    As unchecked exceptions are not required to be caught or declared
    super keyword can be used to avoid overriding conflicts and solve overriding problem
*/

class Parent4{
    void msg() throws ArithmeticException{
        System.out.println("Parent method");
    }
}
public class TestExceptionChild4 extends Parent4{
    void msg() throws ArithmeticException{
        super.msg();
        System.out.println("Child method");
    }
    public static void main(String[] args) {
        TestExceptionChild4 t= new TestExceptionChild4();
        t.msg();
    }
}