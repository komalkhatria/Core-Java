/*CASE 8:
    Parent class method: throws Checked Exception
    Child class method: throws Unchecked Exception, valid for overriding

    try-catch block must be used
        while calling overridden method through child class object
        while calling parent class method in child class using super keyword
*/

import java.io.IOException;
class Parent8{
    void msg() throws IOException{
        System.out.println("Parent method");
    }
}
public class TestExceptionChild8 extends Parent8{
    void msg() throws ArithmeticException{
        try{
            super.msg();
        }
        catch(IOException e){

        }
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