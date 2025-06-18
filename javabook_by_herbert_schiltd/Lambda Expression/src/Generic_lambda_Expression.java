interface gen<T>{
    T func(T t);
}
public class Generic_lambda_Expression {
    public static void main(String[] args) {

        gen<String> reverse =(str)->{
            String result= " ";
            for (int i = str.length()-1; i >=0 ; i--) {
                result=result+str.charAt(i);
            }
            return result;
        };
        System.out.println("the reverse of Lambda is"+reverse.func("Lambda"));
        System.out.println("the reverse of Expression is"+reverse.func("Expression"));


        gen<Integer> myfact=(n)->{
            int result =1;
            for (int i=1;i<=n;i++){
                result*= i;
            }
            return result; };
        System.out.println("The factorial of 5: "+myfact.func(5));
        System.out.println("The factorial of 10: "+myfact.func(10));
    }
}
