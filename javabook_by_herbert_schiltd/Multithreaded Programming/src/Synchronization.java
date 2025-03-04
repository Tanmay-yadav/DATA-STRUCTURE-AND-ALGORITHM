public class Synchronization {
    // this program is not synchronnized
    static class callme{
        void call(String msg){
            System.out.println("["+ msg);
        try{
        Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
            System.out.println("]");
        }
    }
    static class caller implements Runnable{
        String msg;
        callme target;
        Thread t;
        public caller(callme targ,String s){
            target = targ;
            msg =s;
            t = new Thread(this);
        }
        public void run(){
            target.call(msg);
        }
    }
//    class Synch{
        public static void main(String[] args) {
            callme target = new callme();
            caller ob1 =new caller(target,"Hello");
            caller ob2 =new caller(target,"Synchronized");
            caller ob3 =new caller(target,"world");
            // start the threads.
            ob1.t.start();
            ob2.t.start();
            ob3.t.start();

            // wait for threads to end
            try{
                ob1.t.join();
                ob2.t.join();
                ob3.t.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupted main");
            }
        }
    }
//}
