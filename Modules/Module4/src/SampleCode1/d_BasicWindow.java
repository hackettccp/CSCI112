package SampleCode1;

import javax.swing.JFrame;

/**
 * Demonstrates using a JFrame to create a basic window.
 */
public class d_BasicWindow {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("A Simple Window");                       //Creates a JFrame object for demonstration
        frame.setSize(350, 250);                                            //Sets the width and height of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               //Sets the window's close operation
        frame.setVisible(true);                                             //Finally, after the window is set up it is set to visible
    }
    
}
