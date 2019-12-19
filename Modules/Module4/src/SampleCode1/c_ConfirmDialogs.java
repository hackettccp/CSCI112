package SampleCode1;

import javax.swing.JOptionPane;

/**
 * Demonstrates a confirmation dialog.
 */
public class c_ConfirmDialogs {
    
    public static void main(String[] args) {
        while(true) {                                                                               //Infinite Loop that can only be stopped by pressing Yes
            int result = JOptionPane.showConfirmDialog(null, "Do you wish to exit?");               //Prompts the user if they wish to exit. The result will be tested below
            
            if(result == JOptionPane.YES_OPTION) {
                break;                                                                              //Stops the loop
            }
            else if(result == JOptionPane.NO_OPTION) {
                continue;                                                                           //Continues the loop
            }
            else if(result == JOptionPane.CANCEL_OPTION) {

                JOptionPane.showMessageDialog(null, "Sorry, you can't cancel this.");               //Displays a message dialog when the user selected Cancel
            }
        }
    }

}
