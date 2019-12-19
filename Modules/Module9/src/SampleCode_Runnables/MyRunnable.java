package SampleCode_Runnables;

/**
 * Class that implements the Runnable interface
 */
public class MyRunnable implements Runnable {

     private int interval;                                                                                              //Controls how long the loop in the run method pauses between iterations

    /**
     * Constructor. Simply sets the amount of time to pause each iteration of the loop in the run method.
     */
     public MyRunnable(int intervalIn) {
         interval = intervalIn;
     }

    /**
     * Override of Runnable run method. This is called when start() is called on the thread/runnable.
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

