package SampleCode_Threads;

/**
 * Demonstrates multi-threading with Thread subclasses.
 */
public class MyThreadDemo {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args){
        Thread threadA = new MyThread("THREAD A", 2000);                                                                //2 seconds (2000 milliseconds) between printouts
        Thread threadB = new MyThread("THREAD B", 1000);                                                                //1 second (1000 milliseconds) between printouts
        System.out.println("Main Method --- Starting threads.");
        threadA.start();                                                                                                //Starts the first thread
        threadB.start();                                                                                                //Starts the second thread
        System.out.println("Main Method --- Both threads have been started.");
        try {
            System.out.println("Pausing main Thread for 10 seconds --- " + Thread.currentThread().getName());           //Pauses the main thread for 10 seconds
            Thread.sleep(10000);
            System.out.println("Resuming main Thread --- " + Thread.currentThread().getName());                         //Shows the main thread has resumed
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MAIN METHOD FINISHED");
    }
}

