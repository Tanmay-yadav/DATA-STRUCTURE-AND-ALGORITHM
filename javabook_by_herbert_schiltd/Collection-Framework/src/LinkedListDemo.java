//Demontarate LinkedList.
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a linked list.
        LinkedList<String> l1=new LinkedList<String>();
        //Add elements to the linked list.
        l1.add("F");
        l1.add("B");
        l1.add("D");
        l1.add("E");
        l1.add("C");
        l1.add("Z");
        l1.add("A");
        System.out.println("before changing index 1 of l1:" + l1);
        l1.add(1,"A2");
        System.out.println("original contents of l1:" + l1);

        //Remove elements to the linked list.
        l1.remove("D");
        l1.remove(2);
        System.out.println("after removing contents of l1:" + l1);
    }
}
