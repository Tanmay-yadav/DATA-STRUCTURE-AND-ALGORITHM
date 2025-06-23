// Demonstrate a raw type
class Gen<T>{
    T ob; // declare an object of type T
    // Pass the constructor a refernce to
    // an objectof type T
    Gen(T o){
        ob =o;
    }
    // Return ob.
    T getob(){
        return ob;
    }
}
// Demonstrate raw type.
public class RawDemo {
    public static void main(String[] args) {
        // create a Gen object for Integers.
        Gen<Integer> iob =new Gen<Integer>(88);
        // create a Gen object for Strings.
        Gen<String> strob =new Gen<String>("Generics Test");
        // create a raw-type Gen  Object and give it
        // a Double value.
        Gen raw= new Gen(Double.valueOf(98.6));

        //cast here is necessary because type is unknown.
        double d =(Double)raw.getob();
        System.out.println("Value: "+ d);
        //This use of a raw type can lead to run- time
        //exceptions.Here are some examples.
        //The following cast causes a run-time error!
        //int i =(Integer) raw.getob(); // run time error
        // This assignment overrides type safety.
//        strob =raw; //ok but potentially wrong
//        String str = strob.getob(); // run time error

        //This assignment also overrides type safety.
        raw =iob; //ok but potentially wrong
        d =(Double) raw.getob();  //run-time error
//        
    }
}
