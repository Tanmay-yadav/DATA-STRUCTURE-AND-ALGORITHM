// A simple generic class.
//here,T is a type parameter that
//will be replaced by a real type
//when an object of type Gen is created.

class Gen<T>{
    T ob; //declare an object of type T
    //Pass the constructor a reference to
    // an object of type T.
    Gen(T o){
        ob=o;
    }
    //Return ob
    T getob(){
        return ob;
    }
    //Show type of T.
    void showType(){
        System.out.println("Type of T is "+ob.getClass().getName());
    }
}
// Demonstrate the generic class.
public class GenDemo {
    public static void main(String[] args) {
        //create a Gen<Integer> object and assign its
        Gen<Integer> iob;
        //reference to iob. Notice the use of autoboxing
        //to encapsulate the value 88 within an Integer Object.
        iob=new Gen<Integer>(88);

        // show the type of data used by iob.
        iob.showType();
        // Get the value in iob.notice that
        // no cast is needed.
        int v = iob.getob();
        System.out.println("value: "+v);
        System.out.println();
        // create a Gen object for Strings.
        Gen<String> strob= new Gen<String> ("Generic Test");
        //show the type of data used by strob.
        strob.showType();
        // Get the Value of Strob.Again,notice
        //the no cast is needed.
        String str = strob.getob();
        System.out.println("Value: "+ str);
    }
}
