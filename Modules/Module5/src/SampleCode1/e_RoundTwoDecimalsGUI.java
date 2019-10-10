package SampleCode1;

import javax.swing.JOptionPane;

/**
 * Demonstrates Formatting a Number for a Label or other graphical component.
 */
public class e_RoundTwoDecimalsGUI {
    
    public static void main(String[] args) {
        double myValue = 5.463;
        String formattedMyValue = String.format("%.2f", myValue);                                                                           //The String format method is used in a similar fashion to System.out.printf

        JOptionPane.showMessageDialog(null, "Without formatting: " + myValue, "Window 1", JOptionPane.INFORMATION_MESSAGE);                 //Without formatting
        JOptionPane.showMessageDialog(null, "With formatting: " + formattedMyValue, "Window 2", JOptionPane.INFORMATION_MESSAGE);           //With formatting
    }
    
}
