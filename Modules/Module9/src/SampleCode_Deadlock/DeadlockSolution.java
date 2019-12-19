package SampleCode_Deadlock;

/**
 * This program avoids a deadlock situation with two threads.
 *
 * The only difference is that ThreadDemo2 uses the same sequence (Lock1, then Lock2) as ThreadDemo1
 *
 */
public class DeadlockSolution {
   public static Object Lock1 = new Object();                                                            //A generic Object used by the example threads
   public static Object Lock2 = new Object();                                                            //A second generic Object used by the example threads

   /**
    * Main Method. This is where the program begins.
    */
   public static void main(String args[]) {
      ThreadDemo1 T1 = new ThreadDemo1();                                                                //Instantiates a threaded class
      ThreadDemo2 T2 = new ThreadDemo2();                                                                //Instantiates a different threaded class
      T1.start();                                                                                        //Starts the first thread
      T2.start();                                                                                        //Starts the second thread
   }

   /**
    * Static class (accessible by static main method) that is a subclass of Thread.
    */
   private static class ThreadDemo1 extends Thread {

      /**
       * Override of Runnable run method. This is called when start() is called on the thread/runnable.
       */
      public void run() {
         System.out.println("Thread 1: Waiting for Lock1...");
         synchronized(Lock1) {                                                                          //Tries to exclusively use Lock1
            System.out.println("Thread 1: Holding Lock1...");
            try {
               Thread.sleep(2000);                                                                      //Pauses for 2 seconds
            }
            catch (InterruptedException e) {
               System.out.println("Thread1: " + e.getMessage());
            }

            System.out.println("Thread 1: Waiting for Lock2...");
            synchronized(Lock2) {                                                                        //Tries to exclusively use Lock2
               System.out.println("Thread 1: Holding Lock1 & Lock2...");
            }
         }
         System.out.println("Thread 1: Released Lock1 and Lock2. Finished.");
      }
   }

   /**
    * Static class (accessible by static main method) that is a subclass of Thread.
    */
   private static class ThreadDemo2 extends Thread {
      /**
       * Override of Runnable run method. This is called when start() is called on the thread/runnable.
       */
      public void run() {
         System.out.println("Thread 2: Waiting for Lock1...");
         synchronized(Lock1) {                                                                          //Tries to exclusively use Lock1
            System.out.println("Thread 2: Holding Lock1...");
            try {
               Thread.sleep(2000);                                                                      //Pauses for 2 seconds
            }
            catch (InterruptedException e) {
               System.out.println("Thread2: " + e.getMessage());
            }

            System.out.println("Thread 2: Waiting for Lock2...");
            synchronized(Lock2) {                                                                        //Tries to exclusively use Lock2
               System.out.println("Thread 2: Holding Lock1 & Lock2...");
            }
         }
         System.out.println("Thread 2: Released Lock1 and Lock2. Finished.");
      }
   }
}
