package CollectionFramework.Queue;

import java.util.LinkedList;

public class JavaLinkedListQueue {

    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();

        // Offers or inserts the element in the LinkedList.
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        // Prints the LinkedList.
        System.out.println(queue);

        // Polls or removes the element from the LinkedList.
        queue.poll();
        System.out.println(queue);

        // Prints the topmost element.
        System.out.println(queue.peek());
    }
}
