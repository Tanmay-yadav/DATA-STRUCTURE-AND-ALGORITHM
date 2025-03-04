public class isAlive_join_Method  implements Runnable{
    // using join() to wait for threads to finish.
    String name;
    Thread t;

    public isAlive_join_Method( String Threadname){
        name = Threadname;
        t =new Thread(this, name);
        System.out.println("Thread: "+ t);

    }
    public void run(){
        try{
            for (int i =5; i>0;i--){
                System.out.println(name +" "+ i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread "+name +" got interrupted" );
        }
        System.out.println(name +"Exiting");
    }

    public static void main(String[] args) {
        isAlive_join_Method ist1 =new isAlive_join_Method("one");
        isAlive_join_Method ist2 =new isAlive_join_Method("Two");
        isAlive_join_Method ist3 =new isAlive_join_Method("Three");

        // start the thread
        ist1.t.start();
        ist2.t.start();
        ist3.t.start();
        System.out.println("Thread one is alive "+ ist1.t.isAlive());
        System.out.println("Thread two is alive "+ ist2.t.isAlive());
        System.out.println("Thread three is alive "+ ist3.t.isAlive());
         // wait for threads to finish
        try{
            System.out.println("waiting for Threads to finish.");
            ist1.t.join();
            ist2.t.join();
            ist3.t.join();
        } catch (InterruptedException e) {
            System.out.println("main thread is Interrupted");
        }
        System.out.println("Thread one is Alive "+ist1.t.isAlive());
        System.out.println("Thread two is Alive "+ist2.t.isAlive());
        System.out.println("Thread three is Alive "+ist3.t.isAlive());

    }
}
