interface stringfunc{
    String func(String n);
}
public class lambda_as_argument {
    // This method has a functional interface as the type of
    //its first parameter.Thus,it can be passed as a reference to
    //by a lambda expression.
    //The second parameter specifies the string to operate on.
    static String stringop(stringfunc sf , String s){
        return(sf.func(s));
    }

    public static void main(String[] args) {
        String instr ="lambda add power to java";
        String outstr;
        System.out.println("Here is input string: "+instr);
        //here, a  simple expression lambda that upper cases a string
        // is passed to stringop().
        outstr =stringop((str)->str.toUpperCase(),instr);
        System.out.println("The string in uppercase: "+outstr);
        // This passes a block lambda that removes spaces.
        outstr =stringop((str)->{
            String result = " ";
            int i;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j)!=' ')
                    result +=str.charAt(j);

            }
            return result;
        },instr);
        System.out.println("The string with spaces removed: "+ outstr);

        // of course, it is also possible to pass a stringfunc instance
        //created by an earlier lambda expression. for example,
        //after this declaration executes, reverse refers to an
        //instance of Stringfunc.
        stringfunc Reverse = (str)->{
            String result = "";
            int i;
            for (int j = str.length()-1; j >=0 ; j--) {
                result += str.charAt(j);

            }
            return result;};
        // now, reverse can be passed as the first parameter to stringop()
        //since it refers to a StringFunc object.
        System.out.println("The String reversed :"+ stringop(Reverse,instr));

    }
}
