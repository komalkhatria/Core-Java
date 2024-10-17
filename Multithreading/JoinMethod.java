public class JoinMethod extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){
            try{
                // The sleep() method causes the current thread to pause execution for a specified time (in milliseconds)
                // Here, the thread sleeps for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            }
            catch(InterruptedException e){

            }
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        JoinMethod t1= new JoinMethod();
        JoinMethod t2= new JoinMethod();
        t1.start();
        try{
            // The join() method causes t2 thread to wait until t1 has completed its execution
            t1.join();
        }
        catch(InterruptedException e){
            // Handle InterruptedException (in case the thread is interrupted while waiting)
        }
        t2.start();
    }
}
