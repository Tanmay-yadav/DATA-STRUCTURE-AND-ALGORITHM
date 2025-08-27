//Demonstrate ArrayList
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        //Create an array list
        ArrayList<String> a1 =new ArrayList<String>();
        System.out.println("Initial size of a1:"+a1.size());
        //Add elements to the array list.
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        System.out.println("contents of a1:"+a1);
        System.out.println("Adding the element at index 1 ");
        a1.add(1,"Z");
        System.out.println("After adding at index 1 arraylist-->"+a1);
        System.out.println("Size of the arraylist:"+a1.size());
        a1.remove("Z");
        System.out.println("After removing Z-->" +a1);
        a1.remove(1);
        System.out.println("after removing index 1-->" +a1);
        System.out.println("size of the arraylist-->"+a1.size());
        a1.removeAll(a1);
        System.out.println("After removing all-->"+a1+"\n"+"size-->"+a1.size());

        //Get the array
        Integer ia[] =new Integer[a1.size()];
        ia = a1.toArray(ia);

    }
}
