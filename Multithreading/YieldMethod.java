//EXTENDING Thread CLASS TO CREATE A CUSTOM THREAD
class A extends Thread{
    public void run(){

        // The yield() method is called to hint that the current thread is willing to give up its CPU time for other waiting threads of equal priority, allowing them to execute

        Thread.yield();
        for(int i=1; i<=3; i++){
            System.out.println("Parent Thread");
        }
    }
}
public class YieldMethod extends Thread{

    public static void main(String[] args) {
        A t= new A();
        t.start();

        //THIS IS THE MAIN THREAD
        for(int i=1; i<=3; i++){
            System.out.println("Main Thread");
        }
    }
}
