package SampleCode_ThreadPracticalExample;

/**
 * Demonstrates multi-threading with Thread subclasses.
 */
public class ThreadedDialog {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        System.out.println("Started main method.");
        System.out.println("About to open a dialog.");
        System.out.println("main Thread will NOT wait until the dialog is closed.");
        Thread dialogThread = new Dialog("DialogThread");
        dialogThread.start();
        try {
            System.out.println("Pausing main Thread for 3 seconds --- " + Thread.currentThread().getName());            //Pauses the main thread for 3 seconds
            Thread.sleep(3000);
            System.out.println("Resuming main Thread --- " + Thread.currentThread().getName());                         //Shows the main thread has resumed
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main Thread isn't stopped by the dialog.");
        System.out.println("Main Method Complete.");
    }

}

