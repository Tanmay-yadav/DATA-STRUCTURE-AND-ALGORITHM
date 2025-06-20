// NonGen is functionally equivalent to Gen
//but does not use generics.
class NonGen{
    Object ob; // ob is now of type Object
    //pass the constructor a reference to
    // an object of type Object
    NonGen(Object o){
        ob =o;

    }
    // Return type Object.
    Object getob(){
        return ob;
    }
    // Show type of ob.
    void showType(){
        System.out.println("Type of ob is "+ ob.getClass().getName());
    }
}
// Demonstrate the Non-generic class
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        // create NonGen Object and store
        // an integer in it. Autoboxing still occurs.
        iOb =new NonGen(88);
        // Show the type of data used by iOb.
        iOb.showType();
        //Get value of iOb.
        //This time, a cast is necessary.
        int v =(Integer)iOb.getob();
        System.out.println("Value: "+v);

        System.out.println();

        //Create another NonGen object and
        // store a String in it.
        NonGen strOb= new NonGen(("Non-Generics Test"));
        //show the type of Data used by strob.
        strOb.showType();
        //get the value os strOb.
        //again,notice that a cast is necessary.
        String str =(String) strOb.getob();
        System.out.println("value: "+str);
        //This compiles, but is conceptually wrong!
        iOb =strOb;
        v=(Integer) iOb.getob(); // run-time error!
    }
}
