//CREATING THREAD BY EXTENDING THREAD CLASS
class MyThread extends Thread{
    //CREATING A THREAD
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println("Thread class is running..");
        }
    }
}
public class ThreadScheduler {
    public static void main(String[] args) {
        //CREATING OBJECT OF THE THREAD CLASS
        MyThread t= new MyThread();
        t.start();      //EXECUTING THE THREAD

        //THIS IS MAIN METHOD THREAD, EXECUTION OF THIS THREAD IS SCHEDULED PRIOI TO THREAD CLASS
        for(int i=1; i<=3; i++){
            System.out.println("Main thread is running..");
        }

    }
}
