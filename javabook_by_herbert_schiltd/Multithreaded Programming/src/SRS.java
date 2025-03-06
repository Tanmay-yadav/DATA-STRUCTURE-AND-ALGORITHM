public class SRS {
    static class NewThread implements Runnable{
    // suspending and resuming a thread the modern way
    String name; // name of thread
    Thread t;
    boolean suspendflag;
    NewThread(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: "+ t);
        suspendflag = false;
    }
    // This is the entry point for THread
        public void run(){
        try{
            for(int i = 15; i>0; i--){
                System.out.println(name +": "+i);
                Thread.sleep(200);
                synchronized(this){
                    while(suspendflag){
                        wait();
                    }
                }
            }
        }catch(InterruptedException e){
            System.out.println(name+ " INterrupted." );
        }
            System.out.println(name+ " Exiting");
        }
        synchronized void mysuspend(){
        suspendflag =true;
        }
        synchronized void myresume(){
        suspendflag = false;
        notify();
        }
}
//class suspendreume{
    public static void main(String[] args) {
   NewThread ob1 = new NewThread("one");
   NewThread ob2 = new NewThread("Two");
   ob1.t.start(); // start the thread
   ob2.t.start(); // start the thread
   try{
       Thread.sleep(1000);
       ob1.mysuspend();
       System.out.println("Suspending thread one");
       Thread.sleep(1000);
       ob1.myresume();
       System.out.println("Resuming Thread one");
       ob2.mysuspend();
       System.out.println("Suspending thread two");
       Thread.sleep(1000);
       ob2.myresume();
       System.out.println("Resuming Thread two");

   }catch(InterruptedException e){
       System.out.println("Main Thread Interrupted");
   }
   // wait for threads to finish
        try{
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main Thread existing");
    }
}
//}
