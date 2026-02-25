package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class basichashmap {

    static void main() {

        HashMap<Integer, String> ages = new HashMap<>();
        ages.put(10, "akash");
        ages.put(16, "yash");
        ages.put(17, "lav");
        ages.put(19, "rishika");
        ages.put(18, "harry");

        // The while loop condition 'ages.isEmpty()' is initially false, so it won't run.
        // A standard way to iterate over a HashMap is using a for-each loop on the entry set.

        for (Map.Entry<Integer, String> entry : ages.entrySet()) {
            // Use entry.getKey() and entry.getValue() to access elements
            System.out.println(entry.getValue() + " is " + entry.getKey());

        }
    }}
