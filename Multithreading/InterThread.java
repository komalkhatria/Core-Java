class IT extends Thread{
    int total= 0;
    public void run(){
        synchronized(this){
            System.out.println("First");
            for(int i=1; i<=10; i++){
                total+=i;
            }
            System.out.println("Second");
            this.notify();
            System.out.println("After notify");
        }
    }
}
public class InterThread {
    public static void main(String[] args) throws InterruptedException{
        IT p= new IT();
        p.start();
        synchronized (p){
            System.out.println("Third");
            p.wait();
            System.out.println("Fourth");
        }
        System.out.println(p.total);
    }
}
