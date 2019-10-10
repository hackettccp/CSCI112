package SampleCode1;

import javax.swing.JOptionPane;

/**
 * Demonstrates Dialog Boxes.
 */
public class a_DialogBoxes {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World");                                                         //Default style

        JOptionPane.showMessageDialog(null, "Hello World", "Dialog Box 1", JOptionPane.INFORMATION_MESSAGE);        //With title and icon

        JOptionPane.showMessageDialog(null, "Warning Message", "Dialog Box 2", JOptionPane.WARNING_MESSAGE);        //With warning icon

        JOptionPane.showMessageDialog(null, "Question Message", "Dialog Box 3", JOptionPane.QUESTION_MESSAGE);      //With question icon

        JOptionPane.showMessageDialog(null, "Error Message", "Dialog Box 4", JOptionPane.ERROR_MESSAGE);            //With error icon

        JOptionPane.showMessageDialog(null, "Plain Message", "Dialog Box 5", JOptionPane.PLAIN_MESSAGE);            //With no icon
    }
    
}
