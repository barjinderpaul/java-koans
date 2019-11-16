import java.security.KeyStore.Entry;
import java.util.*;

class hashMap {

    private static void basics() {
        System.out.println("Map provides 3 collection views : set of keys, set of key-value mappings, set of values");
        System.out.println("hashMap does not gurantee order of mappings");
        System.out.println("Map utilise hashcode() and equals() method to work with get and put operations,  if by any means hashCode() or equals() change, one might get wrong answers.");
        System.out.println("Most of the map concrete classes extend AbstractMap class and implement required methods.");
        System.out.println("Null can be set as key as well as value; key only once, value many times");
        System.out.println("methods = containsKey(), put(), get(), remove() have O(1) complexity");

        System.out.println("Working with HashMap");
        Map<String, String> data = new HashMap<>();
        data.put("A","abc");
        // data["B"] = "bcd";
        data.put("B","bcd");

        String valA = data.get("A");
        String valB = data.get("B");
        String valC = data.get("C");
        String valD = data.getOrDefault("D", "default value being fetched");
        System.out.println(valA + " " + valB + " "+valC + " " + valD);

        // searching for key;
        boolean AExists = data.containsKey("A");
        System.out.println("A is present in the map = "  +  AExists);

        boolean abcValueExists = data.containsValue("abc");
        System.out.println("abcValue is present in the map "  + abcValueExists);

        // Set<Entry<String, String >> entrySet = data.entrySet();
        // System.out.println(entrySet);
        
        Set<String> keySet = data.keySet();
        System.out.println(keySet);

        Collection<String> valueSet = data.values();
        System.out.println("Values present =  " + valueSet);
    }
    public static void main(String[] args) {
        basics();
    }
}