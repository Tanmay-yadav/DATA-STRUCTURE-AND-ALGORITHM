// use a method references to help find the maximum value in a collection.

import java.util.ArrayList;
import java.util.Collections;
class MyClass{
    private int val;
    MyClass(int v){
        val=v;
    }
    int getval(){return val;}
}
public class UseMethodRef {
    //A compare() method compatible with the one defined by Comparator<T>.
    static int compare(MyClass a , MyClass b){
return a.getval()-b.getval();
    }

    public static void main(String[] args) {
        ArrayList<MyClass>a1 = new ArrayList<MyClass>();
        a1.add(new MyClass(1));
        a1.add(new MyClass(4));
        a1.add(new MyClass(2));
        a1.add(new MyClass(9));
        a1.add(new MyClass(3));
        a1.add(new MyClass(7));
        // Find the maximum value in a1 using the compareMC() method.
        MyClass maxValObj =Collections.max(a1,UseMethodRef::compare);
        System.out.println("Maximum value is: "+ maxValObj.getval());
    }
}


