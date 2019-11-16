import java.util.*;

class queue {

    private static void basics(){
        System.out.println("Starting with basics of queue");
        System.out.println("Inserts at end, removes from beginning");
        System.out.println("ordered list of elements as input");
        System.out.println("Blocking queues are used to implement Producer consumer problem because Blocking queues do not allow null values to enter into queue");
        System.out.println("Blocking queues are thread safe");
        System.out.println("Deques are not thread safe");
        System.out.println("Famous implementations are LinkedList, ArrayBlockingQueue and Priority Queue");

    }

    private static void basicOperations() {
        Queue<String>queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        queue.add("Fourth");
        queue.add("Five");

        System.out.println("First element of key = " +  queue.peek());
        String firstElement = queue.poll();
        System.out.println("removed element = " + firstElement);
        System.out.println(queue);

        // offer() is a special add function, it returns if addition into queue is successful else false;

    }

    public static void main(String[] args) {
        basics();
        basicOperations();
    }
}