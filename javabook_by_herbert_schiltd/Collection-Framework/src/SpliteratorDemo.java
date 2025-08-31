//A simple Spliterator demonstration.

import java.util.*;

public class SpliteratorDemo {
    public static void main(String[] args) {
        //create an array list for doubles.
        ArrayList<Double> vals = new ArrayList<>();
        //Add values to the array list.
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        // use tryAdvance() to display contents of vals.
        // Print a heading before showing the elements
        System.out.println("Contents of vals:\n");

// Create a Spliterator to traverse the elements of vals
        Spliterator<Double> splitr = vals.spliterator();

// Use tryAdvance() inside a while loop to print each element one by one
// The loop continues until there are no more elements (tryAdvance returns false)
// The semicolon (;) means the loop has no body; the printing happens inside tryAdvance()
        while (splitr.tryAdvance((n) -> System.out.print(n + " "))) ;

// Print a newline at the end (to move cursor to the next line after printing all elements)
        System.out.println();


        // create new list that contains square roots.
        // Reinitialize spliterator to traverse vals
        splitr = vals.spliterator();

// Create a new ArrayList to store square roots
        ArrayList<Double> sqrs = new ArrayList<>();

// Traverse vals using tryAdvance()
// For each element n, compute Math.sqrt(n) and add to sqrs
        while (splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;

// Print header before showing square root values
        System.out.println("Contents of sqrs: \n");

// Get a spliterator for sqrs
        splitr = sqrs.spliterator();

// Use forEachRemaining() to print all elements of sqrs
        splitr.forEachRemaining((n) -> System.out.print(n + "  "));

// Print a newline at the end
        System.out.println();

    }
}
