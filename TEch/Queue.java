import java.util.PriorityQueue;
import java.util.io;

public class PriorityQueue {
    public static void main(String args[]) {
        PriorityQueue pq = new PriorityQueue();
        // adding elements
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.offer("C ");
        System.out.println(pq);
    }
}