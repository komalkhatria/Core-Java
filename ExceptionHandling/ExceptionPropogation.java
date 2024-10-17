// Exception propogation happens in case of unchecked exceptions
class A{
    void show1(){
        System.out.print(7/0);      // EXCEPTION THROWN FROM TOP OF THE STACK, UNHANDLED
    }
    void show2(){
        show1();        // UNHANDLED EXCEPTION THROWN IN THIS METHOD DROPS DOWN THE STACK TO THE PREVIOUS METHOD
    }                   // EXCEPTION STILL UNHANDLED
    void show3(){
        try{
            show2();        // UNHANDLED EXCEPTION AGAIN DROPS DOWN THE STACK
        }
        catch(ArithmeticException e){       // THIS TIME HANDLING THE EXCEPTION THAT OCCURRED IN THE TOP OF THE STACK WHICH KEPT DROPPING TO THE PREVIOUS STACK
            System.out.println(e);
        }
    }
}
public class ExceptionPropogation {
    public static void main(String[] args) {
        A a= new A();
        a.show3();      //CALL THE BOTTOM MOST STACK SO AS TO CALL ALL THE METHODS CALLED WITHIN
    }
}
