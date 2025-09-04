import java.util.*;

// Custom Comparator to compare strings by their LAST WORD (e.g., last name).
class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // Find the index of the last space in both strings
        // (this marks the start of the last word).
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        // Compare the substrings starting from the last space (last words).
        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));

        // If last names are the same, compare the entire strings
        // (so "John Doe" and "Jane Doe" will be ordered by first name).
        if (k == 0)
            return aStr.compareToIgnoreCase(bStr);
        else
            return k; // Otherwise, order by last name.
    }
    // No need to override equals() since we only care about compare().
}

// Demo class using TreeMap with custom comparator
class TreeMapDemo2 {
    public static void main(String args[]) {
        // Create a TreeMap with our custom comparator TComp
        // This ensures entries are sorted by last name.
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        // Insert elements into the map (name → balance).
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        // Get a set of map entries (so we can iterate).
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Display the map sorted by last names.
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Update John Doe's account by adding 1000.
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        // Show updated balance.
        System.out.println("John Doe's new balance: " +
                tm.get("John Doe"));
    }
}


