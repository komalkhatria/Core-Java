/*CASE 2:
    Parent class method: throws Exception
    Child class method: throws Unchecked Exception, valid for overriding

    try-catch block must be used to handle any exception thrown by the parent method
        when called using the super keyword or
        when the method is called through child class object
    super keyword can be used to avoid overriding conflicts and solve overriding problem(must be used in try-catch)*/

class Parent2{
    void msg() throws Exception{
        System.out.println("Parent method");
    }
}
public class TestExceptionChild2 extends Parent{
    void msg() throws ArithmeticException{
        try{
            super.msg();
        }
        catch(Exception e){

        }
        System.out.println("Child method");
    }
    public static void main(String[] args) {
        TestExceptionChild2 t= new TestExceptionChild2();
        try{
            t.msg();
        }
        catch(Exception e){

        }
    }
}