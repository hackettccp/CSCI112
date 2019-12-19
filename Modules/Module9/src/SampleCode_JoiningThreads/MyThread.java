package SampleCode_JoiningThreads;

/**
 * Subclass of Thread
 */
public class MyThread extends Thread {

    private CountdownPrinter countdownPrinter;

    /**
     * Constructor. Simply sets the name of the thread and the amount of time to pause each iteration of the loop in
     * the run method.
     */
    public MyThread(String name, CountdownPrinter cpIn) {
        super(name);
        countdownPrinter = cpIn;
    }

    /**
     * Override of Thread run method. This is called when start() is called on the thread.
     * Holds a lock on the object referenced by countdownPrinter. Other threads cannot use the object referenced by
     * countdownPrinter until the code in the synchronized statement finishes.
     */
    @Override
    public void run() {
        synchronized(countdownPrinter) {
            countdownPrinter.print();
        }
    }

}

