/*CASE 6:
    Parent class method: throws Checked Exception
    Child class method: throws Exception, not valid for overriding

    The child method cannot throw broader checked exceptions than the parent method.
    Compile-time error
*/

import java.io.IOException;
class Parent6{
    void msg() throws IOException{
        System.out.println("Parent method");
    }
}
public class TestExceptionChild6 extends Parent6{
    void msg() throws Exception{
        try{
            super.msg();
        }
        catch(IOException e){

        }
        System.out.println("Child method");
    }
    public static void main(String[] args) {
        TestExceptionChild5 t= new TestExceptionChild5();
        try{
            t.msg();
        }
        catch(Exception e){

        }

    }
}