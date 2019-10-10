package SampleCode1;

import javax.swing.JOptionPane;

/**
 * Demonstrates Input Dialog Boxes
 */
public class b_InputDialogs {
    
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name.");          //Uses an input dialog to ask the user to enter their name.
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");            //Prints a greeting using a message dialog and the name that was entered.
    }
    
}
