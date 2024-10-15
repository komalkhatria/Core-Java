/*CASE 9:
    Parent class method: throws Unchecked Exception
    Child class method: throws Checked Exception, not valid for overriding

    If parent method throws unchecked exception, then the child method cannot throw checked exceptions
    Compile-time error
*/

import java.io.IOException;
class Parent9{
    void msg() throws ArithmeticException{
        System.out.println("Parent method");
    }
}
public class TestExceptionChild9 extends Parent9{
    void msg() throws IOException{
        super.msg();
        System.out.println("Child method");
    }
    public static void main(String[] args) {
        TestExceptionChild7 t= new TestExceptionChild7();
        try{
            t.msg();
        }
        catch(IOException e){

        }

    }
}