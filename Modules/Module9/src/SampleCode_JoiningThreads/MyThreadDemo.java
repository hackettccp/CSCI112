package SampleCode_JoiningThreads;

/**
 * Demonstrates multi-threading with Thread subclasses.
 */
public class MyThreadDemo {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args){
        CountdownPrinter cPrint = new CountdownPrinter(500);                                                            //One Countdown Object with half-second pauses between outputs

        /*
         * Both threads will have references to the object referenced by cPrint
         */
        Thread threadA = new MyThread("THREAD A", cPrint);
        Thread threadB = new MyThread("THREAD B", cPrint);

        System.out.println("Main Method --- Starting threads.");

        /*
         * Thread A will start. Since it holds a lock on the CountdownPrinter object (the same one given to Thread B),
         * Thread B will wait until Thread A is finished using this CountdownPrinter object.
         */
        threadA.start();
        threadB.start();
        System.out.println("Main Method --- Both threads have started.");

        /*
         * Joins both threads to this (the main) thread. The main thread (the rest of the main method's code) will not
         * will not resume until the two threads have finished.
         */
        try {
            threadA.join();
            threadB.join();
        }
        catch(InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }

        /*
         * The two threads WILL stop the main method from finishing before they do, since they were joined with the main thread.
         */
        System.out.println("Main Method --- Both threads have finished. Resuming main thread.");
        try {
            System.out.println("Pausing main Thread for 3 seconds --- " + Thread.currentThread().getName());            //Pauses the main thread for 3 seconds
            Thread.sleep(3000);
            System.out.println("Resuming main Thread --- " + Thread.currentThread().getName());                         //Shows the main thread has resumed
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MAIN METHOD FINISHED");
    }
}


