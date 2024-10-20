class SyncBA{
    public void table(int n){
        synchronized(this){
            for(int i=1; i<=5; i++){
                System.out.print(n*i + " ");
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }
}
class SyncBB extends Thread{
    SyncBA p;
    SyncBB(SyncBA p){
        this.p= p;
    }
    public void run(){
        p.table(6);
    }
}
class SyncBC extends Thread{
    SyncBA p;
    SyncBC(SyncBA p){
        this.p= p;
    }
    public void run(){
        p.table(8);
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        SyncBA a= new SyncBA();
        SyncBB b= new SyncBB(a);
        SyncBC c= new SyncBC(a);
        b.start();
        c.start();

    }
}
