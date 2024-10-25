
class Daemon1 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.print(i + " ");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){

            }
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        Daemon1 t= new Daemon1();
        t.setDaemon(true);
        t.start();
        System.out.println("Main thread");
    }
}
