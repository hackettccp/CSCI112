package Concurrency.SampleCode_Synchronization;

public class CountdownPrinter {

    private int interval;                                                                                              //Controls how long the loop in the run method pauses between iterations

    /**
     * Constructor. Simply sets the amount of time to pause each iteration of the loop in the run method.
     */
    public CountdownPrinter(int intervalIn) {
        interval = intervalIn;
    }

    /**
     * Prints out a countdown from 10 when called.
     */
    public void print() {
        System.out.println(Thread.currentThread().getName() + " --- START");                                           //Prints the countdown has started (and the name of the thread running this)
        try {
            for(int i = 10; i > 0; i--) {                                                                              //Counts down from 10
                System.out.println(Thread.currentThread().getName() + " --- Countdown --- " + i);                      //Prints the thread name and count down value
                Thread.sleep(interval);                                                                                //Pauses the thread for the specified milliseconds
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " --- FINISHED");                                        //Prints the countdown has ended (and the name of the thread running this)
    }
}
