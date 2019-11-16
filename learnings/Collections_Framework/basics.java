class basics {

    private static void notes() {
        // This method will contain the basics of collection framework.
        /**
         * Root interface of java collections : java.util.Collection
         * java.util.Map is the only interface that doesn't inherit from Collection interface.
         * Some important collection classes are ArrayList, LinkedList, HashMap, TreeMap, HashSet, TreeSet;
         * The toArray() method works as a bridge between Collection and older APIs which take array as an input.
         * Iterator interface provides methods to iterate over any Collection. 
         * Iterators takes the place of Enumeration in the Java Collections Framework.
         * Iterators allow the caller to remove the elements from the underlying collection whereas Enumeration does not **.
         * 
         * Various Interfaces :
         * 1. Set Interface - 
         *  does not allows duplcicates. 
         *  does not allows random access.
         *  iterator or for loop to access elements
         *  implementations HashSet, TreeSet, LinkedHashSet
         * 
         * 2. List Interface -
         *  ordered colelction, can contain duplicates
         *  random access is allowed
         *  Implementations ArrayList and LinkedList
         * 
         * 3. Queue Interface - 
         *  holds data in FIFO manner except priority queues
         *  element is removed by a call to remove or poll.
         *  all new elements are inserted at the tail of the queue.
         * 
         * 4. Dequeue Interface -
         *  linear collection supports element insertion and removal at both ends.
         *  interface supports both capacity fixed as well as not fixed dequeues/
         * 
         * 5. Map Interface -
         *  an object that maps keys to values.
         *  cannot contain duplicate keys.
         *  Implementations HashMap, TreeMap, LinkedHashmap
         *  basic operation put, get, containsKey, containsValue, size and isEmpty
         *  
         * 6. ListIterator Interface - 
         *  allows to traverse in either direction, modify and obbtain the iterator's current position.
         *  traverses by previous() and next methods()
         * 
         * 7. SortedSet Interface - 
         *  maintains its elements in ascending order
         * 
         * 8. SortedMap Interface - 
         *  maintains mappings in ascending order. 
         *  used basically as dictionaries and telephone directories.
         * 
         * 9. Unmodifiable wrappers -
         *  these take away the ability to modify the collection by intercepting all the operations that
         *  would modify the collection and throwing an UnsupportedOperationException.
         *  Main use is to make collection immutable once it has been built.
         *  Its a good practice not to maintain a reference to the backing collection. This absolutely gurantees mutability.
         * 
         *  sample to make unmodifiable lists;
         *  
            package com.journaldev.collections;

            import java.util.ArrayList;
            import java.util.List;
            import java.util.stream.Collectors;

            public class JDK10CollectionFunctions {

                public static void main(String[] args) {

                    // 1. List, Set, Map copyOf(Collection) method
                    List<String> actors = new ArrayList<>();

                    actors.add("Jack Nicholson");
                    actors.add("Marlon Brando");

                    System.out.println(actors);
                    // prints [Jack Nicholson, Marlon Brando]

                    // New API added - Creates an UnModifiable List from a List.
                    List<String> copyOfActors = List.copyOf(actors);

                    System.out.println(copyOfActors);
                    // prints [Jack Nicholson, Marlon Brando]

                    // copyOfActors.add("Robert De Niro"); Will generate
                    // UnsupportedOperationException

                    actors.add("Robert De Niro");

                    System.out.println(actors);
                    // prints [Jack Nicholson, Marlon Brando, Robert De Niro]

                    System.out.println(copyOfActors);
                    // prints [Jack Nicholson, Marlon Brando]

                    // 2. Collectors class toUnmodifiableList, toUnmodifiableSet, and
                    // toUnmodifiableMap methods
                    List<String> collect = actors.stream().collect(Collectors.toUnmodifiableList());
                    System.out.println(collect);
                }

            }

         *  
         * 
         */
    }
    public static void main(String[] args) {
        notes();
    }
}