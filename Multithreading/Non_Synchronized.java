class NSyncA{
    public void wish(String name){
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

class NSyncB extends Thread{
    NSyncA p;       //REFERENCE VARIABLE OF NSyncA CLASS
    String name;
    NSyncB(NSyncA p, String name){
        this.p= p;
        this.name= name;
    }
    public void run(){
        p.wish(name);
    }
}

public class Non_Synchronized {
    public static void main(String[] args) {
        NSyncA a= new NSyncA();
        NSyncB t1= new NSyncB(a, "Andrew");
        NSyncB t2= new NSyncB(a, "Brian");
        t1.start();
        t2.start();
    }
}
