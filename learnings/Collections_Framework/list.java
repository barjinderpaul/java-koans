import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class list {

    private static void basics() {
        System.out.println("Allows dups\nallows null elements \nHas various defaults methods like replaceAll, sort nad spliterator\nGeneric use is must, it also prevents ClassCastException at runtime.");
        System.out.println("Better than vector in a single threaded environment as it is unsynchronized");
        System.out.println("Initial capacity is 10;");
    }

    private static void performingOperations() {
        ArrayList<String> vowels = new ArrayList<String>();
        String [] arrayVowels = new String[5];
        arrayVowels[0] = "a";
        arrayVowels[1] = "e";
        arrayVowels[2] = "i";
        arrayVowels[3] = "o";
        arrayVowels[4] = "u";

        for(int i=0;i<arrayVowels.length;++i) {
            vowels.add(arrayVowels[i]);
        }

        
        // Displaying elements with iterators
        System.out.println("Going to display items in array list");
        ListIterator<String> iterator = vowels.listIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("Displaying elements from back");
        ListIterator<String> iteratorBack = vowels.listIterator(vowels.size());
        while(iteratorBack.hasPrevious()){
            System.out.print(iteratorBack.previous() + " ");
        }

        Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i=0;i<5;++i) {
            nums.add(random.nextInt(10000));
        }

        System.out.println("Sorting in decreasing order");
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("Sorted in descending order");
        // custom sorting;
        nums.sort((a,b)->b-a);
        System.out.println(nums);
    }


    private static void someMoreOperations() {
        ArrayList<Integer> nums = new ArrayList<Integer> ();
        for(int i=0;i<10;i++){
            nums.add(i);
        }

        //displaying elements;
        // like cpp, nums[0] does not work, to set and get elements, one has to use elements 
        // like .get(index) and .set(index);
        System.out.println(nums.get(0));

        System.out.println("size = "  + nums.size());
        nums.add(0,101);
        System.out.println("size = " +  nums.size());
        nums.add(1);
        System.out.println("size = " + nums.size() + " list = "+nums);
        nums.set(0, 11);
        System.out.println("size = " + nums.size() + " list = "+nums);
        

        System.out.println(nums.lastIndexOf(1));
        nums.remove(1); //removes element at this index;
        System.out.println("size = " + nums.size() + " list = "+nums);
        
        // remove last occurence of the specified element
        nums.remove(nums.lastIndexOf(1));
        System.out.println("size = " + nums.size() + " list = "+nums);
        

        nums.removeIf(a->a>2);
        System.out.println("size = " + nums.size() + " list = "+nums);
        

    }

    public static void main(String[] args) {
        basics();
        performingOperations();
        someMoreOperations();

        //Thread safe array list;
        List<Integer> nums = new ArrayList<Integer>();
        List<Integer> synchronizedList = Collections.synchronizedList(nums); 
        
    }
}