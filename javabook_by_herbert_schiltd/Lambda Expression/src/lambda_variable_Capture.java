
interface myFunc{
    int func(int n);
}
public class lambda_variable_Capture {
    // A local variable that can be captured.
    int num=10;
    myFunc mylambda = (n)->{
        // This use of num is ok. it does not modify num.
        int v =num+n;
        // However, the following is illegal because it attempts
        //to modify the value of num.
        //num++;

        return v;};
// The following line would also cause an error, because
    //it would remove the effectively final status from num.
    //num =9;
}
