// Demonstrate finally
public class FinallyDemo {
    //Throw an exception out of the method.
    static void procA(){
        try{
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        }finally{
            System.out.println("Proac's finally.");
        }
    }
    // Return from within a try block.
    static void procB(){
        try{
            System.out.println("inside procB.");
            return;
        }finally{
            System.out.println("ProcB's finally");
        }
    }
    // Execute finally normally.
    static void procC(){
        try {
            System.out.println("inside procC");
        }finally{
            System.out.println("ProcC's finally.");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
        procB();
        procC();
    }
}
