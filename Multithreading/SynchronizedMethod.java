class SyncA{
    public synchronized void wish(String name){
        for(int i=1; i<=3; i++){
            System.out.println("Good morning " + name);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
            }
        }
    }
}

class SyncB extends Thread{
    SyncA p;       //REFERENCE VARIABLE OF SyncA CLASS
    String name;
    SyncB(SyncA p, String name){
        this.p= p;
        this.name= name;
    }
    public void run(){
        p.wish(name);
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        SyncA a= new SyncA();
        SyncB t1= new SyncB(a, "Andrew");
        SyncB t2= new SyncB(a, "Brian");
        t1.start();
        t2.start();
    }
}