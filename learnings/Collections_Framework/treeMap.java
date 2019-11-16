import java.util.*;
import java.util.Map.Entry;

class treeMap {

    private static void basics() {
        System.out.println("SortedMap provides 4 constructors similar to SortedSet");
        System.out.println("TreeMap has complexity of O(logn), implementation of RedBlack Trees");
        System.out.println("TreeMap does not allows null as key");
        System.out.println("In TreeMap, we can easily file nextLower and nextHigher value becuase of its sorted nature");
        System.out.println("In TreeMap, natural ordereing is followed but we can make custom ordering with the help of a comparator");
    }

    private static void basicOperations() {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        for(int i=0;i<10;i++) {
            treeMap.put(i , i + "");
        }
        System.out.println("TreeMap.size() = " + treeMap.size());
        treeMap.keySet().forEach(System.out::println);
        treeMap.values().forEach(System.out::println);

        //checking lower and higher entries;
        // Entry<Integer,String> returns the key-value pair
        Entry<Integer,String> entry = treeMap.lowerEntry(5);
        System.out.println("Closest lower key than 5 is " +  entry);
        entry = treeMap.higherEntry(5);
        System.out.println("Closest higher key than 5 is"  + entry);

        // lowerKey() return only the key;
        System.out.println(treeMap.lowerKey(5));
        System.out.println(treeMap.higherKey(5));

        // first and last key;
        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.pollLastEntry());
        
    }
    public static void main(String[] args) {
        basics();
        basicOperations();

        // implementing SortedMap with custom sort Class
        SortedMap<String,Person> persons = new TreeMap<>( (s1,s2)->s2.length()-s1.length() );
        persons.put("Abcd",new Person(1,"Abcd"));
        persons.put("bcd",new Person(2,"bcd"));
        persons.put("cd",new Person(0,"cd"));

        persons.keySet().forEach(System.out::println);

    
    }   
}

class Person {
    Integer id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return this.id + " " + this.name;
    }
}