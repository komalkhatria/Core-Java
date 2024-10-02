//CREATING THREAD BY EXTENDING THREAD CLASS
class MyThread2 extends Thread{
    //run METHOD USED TO PERFORM SOME ACTION
    public void run(){
        System.out.println("Parent running..");
    }
}
//EXTENDING MyThread2 CLASS, THUS INHERITING THE PROPERTIES OF THREAD CLASS ALSO
class MyThread3 extends MyThread2{
    //OVERRIDING THE run METHOD
    public void run(){
        System.out.println("Child running..");
        super.run();        //THIS WILL OVERRIDE THE run METHOD OF PARENT CLASS CONSIDERING IT AS A NORMAL METHOD, THE THREAD IS STILL IN INACTIVE STATE
        super.start();      //THREAD CANNOT BE OVERRIDEN, IT WILL GIVE IllegalThreadStateException
    }
}
public class OverrideRun {
    public static void main(String[] args) {
        //CREATING OBJECT OF THE CHILD CLASS
        MyThread3 t= new MyThread3();
        t.start();      //THIS WILL BRING THE CHILD CLASS THREAD (run) TO ACTIVE STATE, AND WILL EXECUTE THE THREAD
    }
}