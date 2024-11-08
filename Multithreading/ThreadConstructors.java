public class ThreadConstructors extends Thread{
    ThreadConstructors(String name){
        super(name);
    }
    public void run(){

        System.out.println("Thank you");
    }
    public static void main(String[] args) {

        //CONSTRUCTOR 1
//        Thread t= new Thread();
//        t.start();

        //CONSTRUCTOR 2
        ThreadConstructors t1= new ThreadConstructors("Second Thread");
        t1.start();
        System.out.println("Thread id: " + t1.getId() + ", Name: " + t1.getName());

    }
}
