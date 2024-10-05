package collection;

//import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class LearnPriorityQueue{
    
    public static void main(String[] args) {
        
        Queue<Integer> pq = new PriorityQueue<>(); //This is for a Ascending Order.

        //Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //This is for a Descending Order.

        pq.offer(4210);
        pq.offer(3550);
        pq.offer(11540);
        pq.offer(1040);

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);
        System.out.println(pq.peek());
    }
}