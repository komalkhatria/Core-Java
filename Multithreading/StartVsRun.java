//CREATING THREAD BY EXTENDING THREAD CLASS
class MyThread1 extends Thread{
    //run METHOD USED TO PERFORM SOME ACTION
    public void run(){
        System.out.println("Action performed");
    }
}
public class StartVsRun {
    public static void main(String[] args) {
        //CREATING OBJECT OF THREAD CLASS
        MyThread1 t= new MyThread1();
        t.run();        //THIS WILL CALL THE run METHOD AS A NORMAL METHOD, THE THREAD IS STILL IN INACTIVE STATE
        t.start();      //THIS WILL BRING THE THREAD (run) TO ACTIVE STATE, AND WILL EXECUTE THE THREAD
    }
}
