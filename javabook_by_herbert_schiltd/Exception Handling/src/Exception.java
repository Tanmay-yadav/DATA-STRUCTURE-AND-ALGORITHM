//public class Exception {
////    public static void main(String[] args) {
////        int d =0;
////        int a = 43/d;
////    } // This shows the exception
//
//
//    public static void main(String[] args) {
//       int d;
//       int a;
//       try{// monitor a block of code.
//           d =0;
//          a =42/d;
//           System.out.println("This will not be printed.");
//       }catch(ArithmeticException e){ // catch divide by zero error
//           System.out.println("Exception:"+e);
//       }
//        System.out.println("After catch statement.");
//    }
//}
// ..............Multiple catch statements........................
//
//
//
class MultipleCatches{
    public static void main(String[] args) {
        try {
            int a = args.length; // Gets the number of arguments
            System.out.println("a = " + a);

            int b = 42 / a;  // If a = 0, it causes "ArithmeticException: / by zero"

            int c[] = {1};  // Creates an array with one element: c[0] = 1
            c[42] = 99; // Tries to access c[42], which is out of bounds -> causes "ArrayIndexOutOfBoundsException"
        }
        catch (ArithmeticException e){
            System.out.println("Exception: "+ e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("EXception: "+ e);
        }
//       * If args.length == 0, then a = 0, and 42 / 0 causes ArithmeticException.
//        * If args.length > 0, then b = 42 / a executes normally, but c[42] = 99 will
//              always throw an ArrayIndexOutOfBoundsException because c is an array
//              of size 1 (only c[0] exists).
        System.out.println("After try and catch blocks.");
    }
}