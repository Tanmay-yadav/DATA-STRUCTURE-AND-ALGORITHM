public class InterThread_Communication {
    // An incorrect implementation of a producer and consumer.
    static class Q{
        int n;
        synchronized int get(){
            System.out.println("Got"+ n);
            return n;
        }
        synchronized void put(int n){
            this.n =n;
            System.out.println("Put: "+ n);
        }
    }
    static class Producer implements Runnable{
        Q q;
        Thread t;
        Producer(Q q){
            this.q =q;
            t= new Thread(this,"Producer");
        }
            public void run(){
            int i = 0;
            while(true){
                q.put(i++);
            }
            }
    }
    static class consumer implements Runnable{
        Q q;
        Thread t;
        consumer(Q q){
            this.q =q;
            t =new Thread(this,"Consumer");
        }
        public void run(){
            while(true){
                q.get();
            }
        }
    }
//    class PC{

        public static void main(String[] args) {
            Q q = new Q();
            Producer p = new Producer(q);
            consumer c = new consumer(q);

            // start the threads.
            p.t.start();
            c.t.start();
            System.out.println(" Press control-c to stop");

//        }
    }
}
