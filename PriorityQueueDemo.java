// Java program to remove elements
// from a PriorityQueue

import java.util.*;

public class PriorityQueueDemo {

    public static void main(String args[]) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Pineapple");
        pq.add("Apple");
        pq.add("Orange");
        pq.add("Grapes");
        System.out.println("Initial PriorityQueue " + pq);
        pq.remove("Grapes");
        System.out.println("After Remove - " + pq);
        System.out.println("Peek Method - " + pq.peek());
        System.out.println("Current PriorityQueue - " + pq);
        System.out.println("Poll Method - " + pq.poll());
        System.out.println("Final PriorityQueue - " + pq);
    }
}
