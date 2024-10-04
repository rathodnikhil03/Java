//This code demonstrates creating a queue, adding elements, and removing an element while maintaining the FIFO order.

package collection;

import java.util.LinkedList;
//import java.util.List;
import java.util.Queue;

public class LearnQueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(1);
        queue.add(1);
        queue.offer(2);
        queue.offer(3);

        // Displaying the queue
        System.out.println("Queue: " + queue);

        // Removing an element from the queue
        int removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Displaying the queue after removal and next which element is pop 
        System.out.println("Queue after removal: " + queue.peek());
    }
}
