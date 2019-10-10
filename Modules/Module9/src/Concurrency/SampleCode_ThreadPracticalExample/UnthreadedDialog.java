package Concurrency.SampleCode_ThreadPracticalExample;

import javax.swing.*;

/**
 * Demonstrates multi-threading with Thread subclasses.
 */
public class UnthreadedDialog {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        System.out.println("Started main method.");
        System.out.println("About to open a dialog.");
        System.out.println("main Thread will wait until the dialog is closed before resuming.");
        JOptionPane.showMessageDialog(null, "Close me to resume the main thread/main method.");
        System.out.println("Dialog closed.");
        System.out.println("main Thread resumed.");
        System.out.println("Main Method Complete.");
    }

}

