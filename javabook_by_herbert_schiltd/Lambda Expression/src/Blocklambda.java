interface factorial{
    int func(int n);
}

public class Blocklambda {
    public static void main(String[] args) {

    factorial fact;

    fact =(n)->{
        int result= 1;
        for (int i=1;i<=n;i++){
            result =result*i;
        }
    return result;};
        System.out.println("The factorial of 3 is :"+fact.func(3));
        System.out.println("The factorial of 10 is :"+fact.func(10));
    }


}
