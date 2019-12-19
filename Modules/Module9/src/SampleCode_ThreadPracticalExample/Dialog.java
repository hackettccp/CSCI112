package SampleCode_ThreadPracticalExample;

import javax.swing.*;

public class Dialog extends Thread {

    public Dialog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " --- Thread WILL wait until the dialog is closed before resuming.");
        JOptionPane.showMessageDialog(null, "This is independent of the main thread.\nOn thread " + Thread.currentThread().getName());
        System.out.println("Dialog closed.");
        System.out.println(Thread.currentThread().getName() + " --- Finished");
    }

}
