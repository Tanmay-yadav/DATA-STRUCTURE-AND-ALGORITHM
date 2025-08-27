import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // create an array deque
        ArrayDeque<String> adq = new ArrayDeque<String>();
        //use an ArrayDeque like a Stack.
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.println("popping the stack: ");
        while(adq.peek() !=null)
            System.out.print(adq.pop()+ " ");
//        System.out.println();
        System.out.println();
        System.out.println("size-->"+ adq.size()); // output of size is 0
        // becoz pop removes the element
    }
}
