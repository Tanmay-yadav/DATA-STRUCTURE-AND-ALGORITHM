public class Multiple_Threads implements Runnable {
    String name;
    Thread t;

    Multiple_Threads(String threadname){
        name = threadname;
        t = new Thread(this,name);
        System.out.println("New Thread: "+ t);
    }
    //This is the entry point for the thread
    public void run(){
        try{
            for (int i =5;i>0;i--){
                System.out.println(name +" :"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println( " Thread"+name +" is interrupted");
        }
        System.out.println("Exiting Thread "+ name);
    }
}
    class MultiThreadDemo{
        public static void main(String[] args) {
            Multiple_Threads mt1= new Multiple_Threads("one");
            Multiple_Threads mt2= new Multiple_Threads("Two");
            Multiple_Threads mt3= new Multiple_Threads("Three");
            // start the thread.
            mt1.t.start();
            mt2.t.start();
            mt3.t.start();
            try{
                // wait for other threads to end
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
            System.out.println("Main thread exiting");
    }
    }
