interface MyNumber {
    double getValue();
}

public class lambdaDemo {
    public static void main(String[] args) {
        MyNumber mynum;
        //declare an interface reference
        //Here , the lambda expression is simply a constant expression.
        // when it is assigned to mynum, a class instance is
        //constructed in which the lambda expression implements
        // the getValue() method in myNumber
        mynum = () -> 123.45;
        // call getvalue(); which is provided by the previously assigned
        //lambda expression.
        System.out.println("A fixed value: " + mynum.getValue());
        //here, a more complex expression is used.
        mynum = () -> Math.random() * 100;

        //call the getvalue on the lambda expression above
        System.out.println("The first random value :" + mynum.getValue());
        System.out.println("The second random value " + mynum.getValue());
    }
}
