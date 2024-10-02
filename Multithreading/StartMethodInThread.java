//CREATING THREAD BY EXTENDING THREAD CLASS
class MyThread5 extends Thread{

    //UNREACHABLE THREAD AS THERE IS A NORMAL METHOD NAMED start WHICH BRINGS THE THREAD TO ACTIVE STATE
    public void run(){
        System.out.println("This is run method");
    }
    //NORMAL START METHOD
    public void start(){
        System.out.println("This is start method");
    }
}
public class StartMethodInThread{
    public static void main(String[] args) {
        MyThread5 t= new MyThread5();
        t.start();      //THIS WILL CALL NORMAL START METHOD INSTEAD OF EXECUTING THE THREAD

        //ONE WAY TO REACH run METHOD
        t.run();        //BUT THE THREAD IS STILL IN INACTIVE STATE AS HERE NORMAL RUN METHOD IS BEING CALLED
    }
}
