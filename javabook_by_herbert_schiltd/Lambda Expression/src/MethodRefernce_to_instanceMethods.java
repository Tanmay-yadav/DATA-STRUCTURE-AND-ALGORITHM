// Demonstrate a method refernce to an instance method
// A functional interface for String operations.
interface stringFunc{
    String func(String n);
}
// now, this class defines an instance method called strReverse().
class Mystringops{
    String Reverse(String str){
        String result ="";
        int i;
        for (int j = str.length()-1; j >=0 ; j--) {
            result+=str.charAt(j);
        }
        return result;}
}

public class MethodRefernce_to_instanceMethods {
    // This method has a functional interface as the type of
    //its first parameter. Thus, it can be passed any instance
    //of that interface, including method refernces.
    static String stringop(stringFunc sf , String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String instr ="Lambda add power to java ";
        String outStr;
        // create a MyStringops object.
        Mystringops strops =new Mystringops();
        // now, a method refernce to the instance method strReverse
        //is passed to stringop().
        outStr=stringop(strops::Reverse,instr);
        System.out.println("original String :"+instr);
        System.out.println("reversed String :"+outStr);
    }
}
