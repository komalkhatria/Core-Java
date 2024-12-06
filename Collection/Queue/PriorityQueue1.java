import java.util.PriorityQueue;
import java.util.Scanner;
public class PriorityQueue1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        PriorityQueue<String> q= new PriorityQueue<>();      //creating string priority queue
        q.add("Java");        //adding object in priority queue
        q.add("Python");
        q.add("C++");
        q.add("Javascript");
        System.out.println(q);

        System.out.print("Enter size of priority queue: ");
        int size= sc.nextInt();
        PriorityQueue q2= new PriorityQueue();      //creating priority queue


        //adding objects in priority queue through user input
        System.out.print("Enter elements in priority queue: ");
        for(int i=0; i<size; i++){
            q2.add(sc.next());
        }
        System.out.println(q2);
    }
}
