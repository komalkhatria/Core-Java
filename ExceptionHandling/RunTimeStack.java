//For every thread, JVM creates a run-time stack.

//Each and every call performed in a thread is stored in the stack.

//METHODS IN RUNTIME STACK EXECUTE IN LIFO(Last In First Out) MANNER
public class RunTimeStack{
    void method1(){
        System.out.println("Function 1");
    }
    void method2(){
        method1();        //THIRDLY METHOD1 IS STORED IN THE STACK
        System.out.println("Function 2");
        System.out.println(9/0);        //EXCEPTION OCCURS HERE, NORMAL FLOW OF THE CODE IS DISTURBED
    }
    void method3(){
        method2();      //SECONDLY METHOD2 IS STORED IN THE STACK
        System.out.println("Function 3");
    }
    public static void main(String[] args) {        //FIRSTLY MAIN THREAD WILL CALL THE MAIN METHOD
        System.out.println("Main thread starts");
        new RunTimeStack().method3();     //METHOD3 IS STORED IN THE STACK FIRST AS IT IS THE FIRST CALL IN THE MAIN THREAD

        System.out.println("Main thread ends");
    }
}
