class Sales{
    public synchronized void msg(Purchases p){
        System.out.println("Sales");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){

        }
        p.confirm();
    }
    public synchronized void confirm(){
        System.out.println("Goods sold");
    }
}
class Purchases{
    public synchronized void msg(Sales s){
        System.out.println("Purchases");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){

        }
        s.confirm();
    }
    public synchronized void confirm(){
        System.out.println("Goods purchased");
    }
}
public class Deadlock implements Runnable{
    Sales s = new Sales();
    Purchases p = new Purchases();
    public Deadlock(){
        Thread t = new Thread(this);
        t.start();
        s.msg(p);
    }
    public void run(){
        p.msg(s);
    }
    public static void main(String[] args) {
        new Deadlock();
    }
}
