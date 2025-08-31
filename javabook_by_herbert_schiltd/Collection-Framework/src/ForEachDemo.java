//use the for-each for loop to cycle through a collection
import java.util.*;
public class ForEachDemo {
    public static void main(String[] args) {
        //create an array list for integers.
        ArrayList<Integer> vals = new ArrayList<Integer>();
        // add values to the array list
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        // use for loop to display the values.
        System.out.print("Contents of the vals:[ ");
        for (int v:vals){
            System.out.print(v+" ");
        }
        System.out.print("]");
        System.out.println();
        // Now, sum the values by using a for loop.
        int sum =0;
        for(int v:vals){
            sum=sum+v;
        }
        System.out.println("sum of values: "+ sum);
    }
}
