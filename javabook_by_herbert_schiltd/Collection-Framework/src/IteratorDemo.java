import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        //create an array list.
        ArrayList<String> a1 =new ArrayList<String>();
        // Add elements to the array list.
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
    // Use iterator to display contents of a1.
        System.out.println("Original contents of a1: ");
        Iterator<String> itr = a1.iterator();
        while(itr.hasNext()){
            String element =itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
//modify objects being iterated.
        ListIterator<String>litr =a1.listIterator();
        while(litr.hasNext()){
            String element = litr.next();
            litr.set(element +"+");

        }
        System.out.println("Modified contents of a1: ");
        itr=a1.iterator();
        while(itr.hasNext()){
            String element =itr.next(); // here next() function gives/returns the next element
            System.out.print(element+ " ");

        }
        System.out.println();
        //now, display the list backward.
        System.out.println("Modified list backward: ");
        while(litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element+ " ");
        }
        System.out.println();
    }
}
