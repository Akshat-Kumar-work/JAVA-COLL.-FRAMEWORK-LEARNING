
import java.util.ArrayDeque;
public class arraydeque {

    public static void main (String [] args){

        ArrayDeque <Integer> adq = new ArrayDeque <>();
        //to add elements
        adq.offer(1);
        adq.offer(2);
        adq.offer(3);
        adq.offer(4);
        adq.offer(5);

        //to add element at starting  of queue
        adq.offerFirst(8);
        System.out.println(adq);

        //to remove first element from starting of queue
        adq.pollFirst(); 
        System.out.println(adq);

        //to remove element from last of queue
        adq.pollLast();
        System.out.println(adq);
        
    }
    
}
