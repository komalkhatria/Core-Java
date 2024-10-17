// The sleep() method causes the current thread to pause execution for a specified time (in milliseconds)
// Here, the thread sleeps for 1000 milliseconds (1 second)
// sleep method is always called in try-catch block so as to handle the exception that may occur
// sleep() is used to execute multiple threads simultaneously

public class SleepMethod extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){       //Handle InterruptedException (in case the thread is interrupted while sleeping)

            }
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        SleepMethod t1= new SleepMethod();
        SleepMethod t2= new SleepMethod();

        //STARTING MULTIPLE THREADS OF THE SAME Thread CLASS
        t1.start();
        t2.start();
    }
}
