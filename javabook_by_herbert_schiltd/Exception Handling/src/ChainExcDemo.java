// Demonstrate exception chaining
public class ChainExcDemo {
    static void demoproc(){
        // create an exception
        NullPointerException e =new NullPointerException("top layer");
        // add a cause
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException e){
            //display top level exception
            System.out.println("caught: "+ e);

            // display cause exception
            System.out.println("Original cause:" + e.getCause());
        }
    }
}
