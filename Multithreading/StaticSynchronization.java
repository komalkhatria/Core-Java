class Ssync{
    public static synchronized void table(int n){
        for(int i=1; i<=10; i++){
            System.out.print(n*i + " ");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){

            }
        }
    }
}
class SsyncB extends Thread{
    public void run(){
        Ssync.table(5);
    }
}
class SsyncC extends Thread{
    public void run(){
        Ssync.table(7);
    }
}
public class StaticSynchronization {
    public static void main(String[] args) {
        SsyncB b= new SsyncB();
        SsyncC c= new SsyncC();
        b.start();
        c.start();
    }
}
