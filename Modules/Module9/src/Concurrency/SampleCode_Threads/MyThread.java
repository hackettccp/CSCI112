package Concurrency.SampleCode_Threads;

/**
 * Subclass of Thread
 */
public class MyThread extends Thread {

     private int interval;                                                                                              //Controls how long the loop in the run method pauses between iterations

    /**
     * Constructor. Simply sets the name of the thread and the amount of time to pause each iteration of the loop in
     * the run method.
     */
     public MyThread(String name, int intervalIn) {
         super(name);
         interval = intervalIn;
     }

    /**
     * Override of Thread run method. This is called when start() is called on the thread.
     */
     @Override
     public void run() {
         System.out.println(Thread.currentThread().getName() + " --- START");                                           //Prints the thread has started (and its name)
         try {
             System.out.println("Pausing " + Thread.currentThread().getName() + " for 5 seconds.");
             Thread.sleep(5000);                                                                                        //Pauses the Thread for 5 seconds (5000 milliseconds)
             for(int i = 10; i > 0; i--) {                                                                              //Counts down from 10
                 System.out.println(Thread.currentThread().getName() + " --- Countdown --- " + i);                      //Prints the thread name and count down value
                 Thread.sleep(interval);                                                                                //Pauses the thread for the specified milliseconds
             }
         }
         catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println(Thread.currentThread().getName() + " --- FINISHED");                                        //Prints the thread has ended (and its name)
     }
    
}

