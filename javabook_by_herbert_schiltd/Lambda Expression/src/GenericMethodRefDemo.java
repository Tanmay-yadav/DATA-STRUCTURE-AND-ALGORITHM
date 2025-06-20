// Demonstrate a method reference to a generic method
// declare inside a non-generic class.
// A functional interface that operates on an array
// and a value, and returns an int result.
interface MyFunct<T>{
    int func(T[]vals,T v);
}
// This class defines a method called countMAtching ()that
// returns the number of items in an array that are equal
//is generic, but MyArrayopsis not.
class MyArrayops{
    static <T> int countMatching(T[]vals,T v){
        int count =0;
        for(int i=0;i<vals.length;i++){
            if (vals[i]==v) count++;
        }
    return count;}
}
public class GenericMethodRefDemo {
    // This method has the MyFunc functional interface as the
    //type of its first parameter .The other two paramerters
    //receive an array and a value, both of type T.
    static <T> int myop(MyFunct<T> f,T[]vals, T v){
        return f.func(vals,v);
    }

    public static void main(String[] args) {
        Integer[] vals ={1,2,3,4,4,5};
        String[]strd ={"one","Two","Three","Two"};
        int count;
        count = myop(MyArrayops::<Integer>countMatching,vals,4);
        System.out.println("vals contains "+count+" 4s");
        count = myop(MyArrayops::<String>countMatching,strd,"Two");
        System.out.println("strd contains "+count+" Twos");
    }
}
