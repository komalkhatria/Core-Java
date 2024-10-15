/*CASE 1:
    Parent class method: throws Exception
    Child class method: also throws Exception, valid for overriding

    try-catch block must be used to handle any exception that might be thrown by the overridden method in either parent or child class.
    super keyword can be used to avoid overriding conflicts and solve overriding problem*/

class Parent{
    void msg() throws Exception{
        System.out.println("Parent method");
    }
}
public class TestExceptionChild1 extends Parent{
    void msg() throws Exception{
        super.msg();
        System.out.println("Child method");
    }
    public static void main(String[] args) {
        TestExceptionChild1 t= new TestExceptionChild1();
        try{
            t.msg();
        }
        catch(Exception e){

        }
    }
}

