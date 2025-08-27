import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // create a Hash Set
        HashSet<String> hs =new HashSet<String>();
        //Add elements to the hash set.
        hs.add("beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("epsilon");
        hs.add("omega");
        System.out.println(hs);
    }
}
