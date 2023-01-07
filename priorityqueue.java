import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;
public class priorityqueue {

    public static void main (String [] args){
Queue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    pq.offer(6);
    pq.offer(2);
    pq.offer(1);
    pq.offer(4);
    pq.offer(5);
    System.out.println(pq); //default priority is high of smallest element

    //to give priority to greatest element use comparator.revereseOrder IN CONSTRUCTOR

    }
    
}
