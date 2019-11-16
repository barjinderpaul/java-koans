import java.util.LinkedList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.Deque;


class linkedListDeque {

    private static void basics() {
        System.out.println("Behaves as deque from cpp STL");
        System.out.println("can add remove peek at both ends");

    }

    private static void basicOperations() {
        Deque<String> names = new LinkedList<String>();
        names.add("abc");
        names.add("abcd");
        names.add("abcde");
        names.add("abcdef");
        names.add("abcdefg");
        names.add("abcdefgh");

        System.out.println(names.size());
        System.out.println(names);
        System.out.println("peek = " + names.peek());
        // peek and peekFirst are same.
        System.out.println("first = " + names.peekFirst());
        System.out.println("last = " + names.peekLast());

        System.out.println(names);
        System.out.println("removing first = " + names.pollFirst());
        System.out.println(names);
        System.out.println("removing last = " + names.pollLast());
        System.out.println(names);

        System.out.println("adding to first = abc");
        names.addFirst("abc");
        System.out.println(names);
        System.out.println("adding at last = abcdefgh");
        names.addLast("abcdefgh");
        System.out.println(names);

        
    }
    
    public static void main(String[] args) {
        basics();
        basicOperations();
    }
}