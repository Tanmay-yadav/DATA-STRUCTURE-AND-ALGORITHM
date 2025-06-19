// demonstrate a method reference for a static method.
// A functional interface for string operations.
interface StringFunc{
    String func(String n);
}
// This class defines a static method called strReverse().
class MyStringops{
    // A static method that reverse a String.
    static String strReverse(String str){
        String result ="";
        int i;
        for (i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        return result;}
}
public class Method_reference {
    // This method has a functional interface as the type of
    // its first parameter. Thus,it can be passed any instance
    //of that interface, including a method refernce.
    static String stringop(StringFunc sf,String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String instr = "Lambdas add powerr to java";
        String outstr;
        // here, a method reference is passed to stringop();
        outstr =stringop(MyStringops::strReverse,instr);
        System.out.println("Original string :" +instr);
        System.out.println("Sting reversed: "+ outstr);
    }
}
