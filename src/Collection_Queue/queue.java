package Collection_Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(3);
        queue1.add(10);
        queue1.add(8);
        queue1.add(2);
        System.out.println(queue1);
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());

        System.out.println(queue1);

        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.add(1);
        queue2.add(3);
        queue2.add(5);
        queue2.add(8);
        System.out.println(queue2);
        System.out.println(queue2);
    }
}
