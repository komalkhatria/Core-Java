//CREATING THREAD BY IMPLEMENTING RUNNABLE INTERFACE
public class CreateThread2 implements Runnable{
    //run METHOD IS USED TO PERFORM ACTION FOR A THREAD
    @Override
    public void run() {     //THREAD IN INACTIVE STATE
        System.out.println("Created thread using interface");
    }

    public static void main(String[] args) {
        CreateThread2 t= new CreateThread2();

//        t.start;      THIS IS NOT A VALID STATEMENT IN JAVA AS RUNNABLE INTERFACE DOES NOT CALL THE start METHOD DIRECTLY

        Thread t1= new Thread(t);       //RUNNABLE INTERFACE CALLS start METHOD THROUGH THE THREAD CLASS OBJECT
        t1.start();     //start METHOD IS USED TO START A NEWLY CREATED THREAD
    }
}
