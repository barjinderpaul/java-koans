import java.util.LinkedList;
import java.util.Random;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;

class linkedlist {

    private static void basics() {
        System.out.println("Basics of linked list");
        System.out.println("Path of implementation of linkedlist");
        System.out.println("It is implementation of Deque and List interface");
        System.out.println("LinkedList -> List -> Collection -> Iterable");
        System.out.println("Internally implemented as Doubly Linked List");
        System.out.println("Not synchronized as well as not thread safe");
        System.out.println("can be used as list, stack, queue");
        System.out.println("random access is not allowed");
        System.out.println("Best case to use LinkedList List is when there are more number of addition of elements in the middle of the list");
        System.out.println("Worst case to use LinkedList List is when there is more number of retrieval operations on the linked list as there is no random access");

    }

    private static void basicOperationsOnLinkedlistList() {
        List<Integer> linkedList = new LinkedList<Integer>();
        Random random = new Random();
        for(int i=0;i<10;i++) {
            linkedList.add(random.nextInt(100));
        }

        linkedList.forEach(e->System.out.print(e+ " "));
        System.out.println();
        ListIterator<Integer> iterator = linkedList.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }


       System.out.println(linkedList.get(0));
       linkedList.set(0,99);
       System.out.println(linkedList);

       System.out.println("Sorted");
       Collections.sort(linkedList);
       System.out.println(linkedList);

       System.out.println("Reverse sorted");
       linkedList.sort((a,b) -> b-a);
       System.out.println(linkedList);

    }

    public static void main(String[] args) {
        basics();
        basicOperationsOnLinkedlistList();
    }
    
}