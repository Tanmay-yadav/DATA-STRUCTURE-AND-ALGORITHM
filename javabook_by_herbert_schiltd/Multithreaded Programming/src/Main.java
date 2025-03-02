public class Main {
    // controlling the main thread

    static class NewThread implements Runnable{
        Thread t;
        NewThread(){
            // create a new , second thread
            t = new Thread(this, "demo Thread");
            System.out.println("child Thread "+ t);
        }
        //This is the entry point for the second thread.
        public void run(){
            try{
                for (int i = 1; i <6 ; i++) {
                    System.out.println("Child THread "+ i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Child THread is interrupted.");
            }
            System.out.println("Exiting Child Thread.");
        }
    }
        public static void main(String[] args) {
//
//            Thread t = Thread.currentThread();
//            System.out.println("current Thread: "+ t );
            NewThread nt =new NewThread(); // create new Thread
            nt.t.start(); // start the thread

//            // change the name of the thread
//            t.setName("My Thread");
//            System.out.println("After name change "+ t);

            try{
                for (int i = 5; i > 0 ; i--) {
                    System.out.println("MAin Thread: "+ i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }

            System.out.println("Main Thread Exiting");


        }
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//    }
}