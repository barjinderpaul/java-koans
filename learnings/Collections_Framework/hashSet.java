import java.util.*;


class sets {

    private static void basics() {
        System.out.println("contains no duplicates");
        System.out.println("cannot get or set elements by index");
        System.out.println("can add only one null element");
        System.out.println("add(), remove() and contains() operations cost O(1) time");
        System.out.println("HashSet's constructors make HashSet with an initial capacity of 16 and a load factor of 0.75");
        System.out.println("load factor is the factor at what the HashSet will automatically increase the size of the HashSet to include more implements");
        

        System.out.println("LinkedHashSet and LinkedHashMap maintains ordering as input");
        System.out.println("HashSet and HashMap become unpredictable ordered when data size is large");
        System.out.println("TreeSet and TreeMap maintain sorted/comparator based order.");
    }

    private static void basicOperations() {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<10;i++){
            set.add(i);
        }
        System.out.println(set);
        for(int i=10;i>=0;i--) {
            set.add(i);
        }


        System.out.println(set);

        int toFind = 10;
        if(set.contains(toFind)) {
            System.out.println("element " + toFind + " is present.");
        }
        else{
            System.out.println("element" + toFind + " is not present.");
        }

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            // both works

            // System.out.print(iterator.next() + " ");
            int i  =(int) iterator.next();
            System.out.print(i + " ");
        }
        System.out.println();

        //checking order
        set.add(12312);
        set.add(-1);
        set.add(2131);

        iterator = set.iterator();
        while(iterator.hasNext()) {
            // both works

            // System.out.print(iterator.next() + " ");
            int i  =(int) iterator.next();
            System.out.print(i + " ");
        }
        System.out.println();

        iterator = set.iterator();
        while(iterator.hasNext()) {
            // both works

            // System.out.print(iterator.next() + " ");
            int i  =(int) iterator.next();
            System.out.print(i + " ");
        }
        System.out.println();

        iterator = set.iterator();
        while(iterator.hasNext()) {
            // both works

            // System.out.print(iterator.next() + " ");
            int i  =(int) iterator.next();
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        basics();
        basicOperations();
        
    }
}