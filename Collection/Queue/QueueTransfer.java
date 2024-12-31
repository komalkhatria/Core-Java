import java.util.*;
public class QueueTransfer {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        Queue<Integer> q2= new LinkedList<>();
        while(q.size()>0){
            q2.add(q.remove());

        }

        System.out.println(q2);
    }
}