public class overloading {
    class overloaddemo{
        void test(){
            System.out.println("no argument");
        }

        void test(int a){
            System.out.println("the integer a is :"+ a);
        }
        void test(int a,int b){
            System.out.println("the value of a and b is:"+a +","+b );
        }
        double test(double a){
            System.out.println("the double a is :"+a);
            return a*a;
        }
    }

    class check{
        public static void main(String[] args) {
            overloading outer =new overloading();  // we need this line because the inner classes are nested
            //into the overloading class and the below line is showing  the error --'overloading.this' cannot be referenced from a static context

            overloaddemo ob= outer.new overloaddemo();
            double result;
            ob.test();
            ob.test(4);
            ob.test(3,5);
            result= ob.test(123.45);

        }
    }
}
