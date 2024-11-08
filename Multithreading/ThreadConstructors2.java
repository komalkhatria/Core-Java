public class ThreadConstructors2 implements Runnable{

    public void run(){
        for(int i=1; i<=3; i++){
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args) {

        //CONSTRUCTOR 3
        ThreadConstructors2 a= new ThreadConstructors2();
        Thread t= new Thread(a);
        t.start();

        //CONSTRUCTOR 4
        Thread t1= new Thread(a, "Second thread");
        t1.start();
        System.out.println("Thread id: " + t1.getId() + " , name: " + t1.getName());
    }
}
