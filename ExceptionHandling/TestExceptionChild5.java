/*CASE 5:
    Parent class method: throws Exception
    Child class method: throws Checked Exception, valid for overriding

    try-catch blocks should be used
        while calling parent method in child class using super keyword
        while calling the overridden method through child class object
*/

import java.io.IOException;
class Parent5{
    void msg() throws Exception{
        System.out.println("Parent method");
    }
}
public class TestExceptionChild5 extends Parent5{
    void msg() throws IOException{
        try{
            super.msg();
        }
        catch(Exception e){

        }
        System.out.println("Child method");
    }
    public static void main(String[] args) {
        TestExceptionChild5 t= new TestExceptionChild5();
        try{
            t.msg();
        }
        catch(IOException e){

        }

    }
}