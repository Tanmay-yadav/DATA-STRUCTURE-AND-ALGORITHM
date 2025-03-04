public class Extending_THread{
 // create a second thread by extending thread

 static class NewThread extends Thread{
  NewThread(){
   // create a new , second Thread
   super("Demo Thread");
   System.out.println("child Thread" + this);
  }
  // This is the entry point for the second THread.
  public void run(){
   try{
    for (int i =5; i>0; i--){
     System.out.println("child Thread"+ i);
     NewThread.sleep(500);
    }
   } catch (InterruptedException e) {
    System.out.println("child THread is Interrupted");
   }
   System.out.println("Exiting child THread");
  }

 }


  public static void main(String[] args) {
   NewThread nt = new NewThread(); // create a new thread
   nt.start(); // start the thread
   try{
    for (int i = 5; i >0 ; i--) {
     System.out.println("MAin Thread "+ i);
     Thread.sleep(1000);
    }
   } catch ( InterruptedException e) {
    System.out.println("Main Thread interrupted");
   }
   System.out.println("Main Thread Exiting.");
  }

 }


