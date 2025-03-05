//public class Deadlock {
    // An example of deadlock.
    class A{
        synchronized void foo(B b){
            String name = Thread.currentThread().getName();
            System.out.println(name + "entered A.foo");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("A Interrupted");
            }
            System.out.println(name + " trying to call B.last() ");
            b.last();
        }
        synchronized void last(){
            System.out.println("Inside A.last");
        }
    }
    class B{
        synchronized void bar(A a){
            String name =Thread.currentThread().getName();
            System.out.println(name + " entered B.bar");

            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("B Interrupted");
            }
            System.out.println(name +" trying to call A.last()");
            a.last();
        }
        synchronized void last(){
            System.out.println("Inside A.last");
        }
    }
     class Deadlck implements Runnable{
        A a =new A();
        B b = new B();
        Thread t;
        Deadlck(){
            Thread.currentThread().setName("MainThread");
            t = new Thread(this,"RacingThread");
        }
        void deadlockstart(){
            t.start();
            a.foo(b); // get lock on b in other thread.
            System.out.println("Back in the MAin thread");
        }
        public void run(){
            b.bar(a); // get lock on b in other thread.
            System.out.println("BAck in other thread");
        }

        public static void main(String[] args) {
            Deadlck dl = new Deadlck(); //  This will show static error
            // if i uncommented the deadlock class above.
            dl.deadlockstart();
        }
    }
//}
