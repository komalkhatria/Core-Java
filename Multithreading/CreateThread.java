//CREATING THREAD BY EXTENDING THREAD CLASS
public class CreateThread extends Thread{

    //run METHOD IS USED TO PERFORM ACTION FOR A THREAD
    public void run(){      //THREAD IN INACTIVE STATE
        System.out.println("Welcome to India");
    }
    public static void main(String[] args) {
        CreateThread t= new CreateThread();

        //start METHOD IS USED TO START A NEWLY CREATED THREAD
        t.start();      //THREAD ENTERS ACTIVE STATE
    }
}
