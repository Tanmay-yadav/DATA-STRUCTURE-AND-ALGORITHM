package Autoboxing;
// Autoboxing/unboxing takes place with
// method parameters and return values.

import static Autoboxing.Autoboxing_And_Method.AutoBox2.m;

public class Autoboxing_And_Method {
class AutoBox2{
    // Take an Integer parameter and
    // return an int value.
    static int m(Integer v){
        return v; // auto-unbox to int
    }

}
    public static void main(String[] args) {
        //Pass  an int to m() and assign the retturn value
        // to an Integer. here, the argument 100 is autoboxed
        // into an Integer. The return value is also autoboxed
        // into an Integer.
        Integer iob =m(100);
        System.out.println(iob);
    }
}
