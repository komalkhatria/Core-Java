//CREATING THREAD BY EXTENDING THREAD CLASS
class MyThread4 extends Thread{
    //run METHOD USED TO PERFORM SOME ACTION
    public void run(){
        System.out.println("Hello");
    }
    //OVERLOADING THE run METHOD IN THREAD CLASS
    public void run(String name){
        System.out.println("Hello " + name);
    }
}
public class OverLoadRun {
    public static void main(String[] args) {
        //CREATING OBJECT OF THE THREAD CLASS
        MyThread4 t= new MyThread4();
        t.start();      //THIS WILL BRING THE THREAD (run) TO ACTIVE STATE, AND WILL EXECUTE THE THREAD

        //CANNOT PASS ARGUMENTS IN start METHOD, SO THREAD CANNOT BE OVERLOADED
        t.start("Java");        //BUILD ERROR, Thread cannot be applied with arguments

        //WAY TO CALL THE run METHOD WITH ARGUMENT
        t.run("Java");      //CALLING NORMAL OVERLOADED run METHOD, NOT THE THREAD

    }
}
