public class Static {
    //    the static keyword is use to make a varible ,class independent of any calling
//    it doesn't needs any instance or object to run the static block of code
//    static class demo {
//       static int a = 100;
//
//
//    }


    class staticDemo {
        static int a = 42;
        static int b = 99;

        static void callme() {
            System.out.println("a = " + a);
        }

    }

    public static void main(String[] args) {
        Static.staticDemo.callme(); // here we didn't need to declare and initialize an object just called the method directly
        System.out.println("b = " + Static.staticDemo.b);


    }
}

//class staticByname {
//    public static void main(String[] args) {
//        Static.staticDemo.callme(); // here we didn't need to declare and initialize an object just called the method directly
//        System.out.println("b = " + Static.staticDemo.b);
////            System.out.println(demo.a);
//    }
//}