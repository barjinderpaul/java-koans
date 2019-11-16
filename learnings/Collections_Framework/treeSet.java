import java.util.*;
class treeSet {
    
    private static void basics() {
        System.out.println("Implementation of SortedSet");
        System.out.println("4 types of constructor");
        System.out.println("1. No argument, 2. Comparator lamba/instance of,");
        System.out.println(" 3. Collection, 4. SortedSet");
        System.out.println("Maintains natural ordering, can be set to custom also with the help of comparators");
        System.out.println("add, remove and contains in O(logn) complexity");
        System.out.println("Internal implementation is of SortedSet");
    }
    
    private static void basicOperations() {
        SortedSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(8);

        treeSet.forEach(System.out::println);

        System.out.println("Smallest elememt = " + treeSet.first());
        System.out.println("Largest element = " + treeSet.last());


        System.out.println("Making subset with .subSet");
        System.out.println("subSet will copy all elements from a value to a specific value");
        SortedSet<Integer> subset = treeSet.subSet(2,11);
        subset.forEach(System.out::println);
    }

    public static void main(String[] args) {
        basics();
        basicOperations();

        // TreeSet with class Person
        System.out.println("Sorting Person class with implementing Comparable class");
        SortedSet<Person> person = new TreeSet<Person>();
        person.add(new Person(1,"abc"));
        person.add(new Person(2,"bcd"));
        person.add(new Person(0,"cde"));
        person.forEach(System.out::println);

        //Another way;
        System.out.println("Sorting Person class with TreeSet comparator");
        SortedSet<Person> person2 = new TreeSet<>((p1,p2)->p1.id - p2.id);
        person2.add(new Person(1,"abc"));
        person2.add(new Person(2,"bcd"));
        person2.add(new Person(0,"cde"));
        person2.forEach(System.out::println);
    }
}

class Person implements Comparable<Person> {
     Integer id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {
       if(this.id != p.id){
           return this.id.compareTo(p.id);
       }
     return this.name.compareTo(p.name);
    }

    @Override
    public String toString(){
        return this.name;
    }
}