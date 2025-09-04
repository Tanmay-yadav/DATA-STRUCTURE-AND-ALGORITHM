// use a Custom comparator

import com.sun.source.tree.Tree;

import java.util.*;

//A reverse comparator for String
class Mycomp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        //Reverse the comparison
//    compareTo() compares two strings lexicographically (dictionary order).
//     Normally, aStr.compareTo(bStr) gives ascending order (A → Z).
//     By swapping (bStr.compareTo(aStr)), the result is reversed → descending order (Z → A).
//     So "Z" comes before "A", "Banana" before "Apple", etc.
        return bStr.compareTo(aStr);
    }
    //No need to override equals or the default methods.
}

class CompDemo {
    public static void main(String[] args) {
        //create a tree set
        TreeSet<String> ts = new TreeSet<String>(new Mycomp()); // here this is
        // the comparison order we wnat
        //add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        // Display the elements
        for (String element : ts) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
