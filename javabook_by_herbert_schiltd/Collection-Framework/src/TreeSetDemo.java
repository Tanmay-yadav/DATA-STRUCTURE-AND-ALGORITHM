import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //create a tree set.
        TreeSet<String> ts = new TreeSet<String>();
        // Add elements to the tree set .
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
    }
}
