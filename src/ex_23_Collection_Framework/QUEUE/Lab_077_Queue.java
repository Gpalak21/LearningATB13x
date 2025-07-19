package ex_23_Collection_Framework.QUEUE;

import java.util.PriorityQueue;

public class Lab_077_Queue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue<>();
        q.add("Palak");
        q.add("Gupta");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
