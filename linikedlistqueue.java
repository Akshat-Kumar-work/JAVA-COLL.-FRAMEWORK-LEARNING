import java.util.Queue;
import java.util.LinkedList;
public class linikedlistqueue {

    public static void main (String [] args){
    //implementing queue by linkedlist

    //creating queue named object of queue class , by linkedlist
    Queue<Integer>queue = new LinkedList<>();

    //to add elements in queue .offer() is used
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    queue.offer(4);
    queue.offer(5);

    System.out.println(queue);

    //to remove element poll is used 
    queue.poll(); //first element which is entered , is out or removed first 
    System.out.println(queue);
    //to know which elements is removed queue.poll() because it return removed elements also while removing from queue
 System.out.println(queue.poll());
 System.out.println(queue);

 //to know which element is first in front side peek is used
System.out.println( queue.peek());


}
    
}
