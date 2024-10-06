//ArrayDeque in Java is a resizable, array-based implementation of the Deque interface. 
//It provides a double-ended queue (Deque) that supports operations at both ends, 
//allowing you to add or remove elements from both the beginning and end of the queue.

package collection;

import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(25);
        adq.offerFirst(12); // offerFirst is a only function of ArrayDeque class.
        adq.offerLast(65); // offerLast is a only function of ArrayDeque class.
        adq.offer(54);

        System.out.println(adq);

        System.out.println("first element : " + adq.peek());
        System.out.println("first element : " + adq.peekFirst()); // peekFirst is a only function of ArrayDeque class.
        System.out.println("last element : " + adq.peekLast());// peekLast is a only function of ArrayDeque class.

        System.out.println(adq.poll());
        System.out.println("poll()" + adq);

        System.out.println(adq.pollFirst());// pollFirst is a only function of ArrayDeque class.
        System.out.println("pollFirst()" + adq);

        System.out.println(adq.pollLast());// pollLast is a only function of ArrayDeque class.
        System.out.println("pollLast()" + adq);
    }
}
