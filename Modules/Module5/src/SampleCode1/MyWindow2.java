package SampleCode1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Subclass of a JFrame.
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class MyWindow2 extends JFrame {

    /**
     * Constructor for creating an instance of this class
     */
    public MyWindow2(String titleIn) {
        super(titleIn);                                                         //Constructor call; Must be first
        super.setSize(350, 250);                                                //Sets up this JFrame using its superclass's methods.
	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();                                        //Creates a JPanel for demonstration purposes
        mainPanel.setBackground(Color.CYAN);                                    //Sets the background colors of the panel (Not shown in the slides; This helps to see that the panel was added)

        super.add(mainPanel);                                                   //Adds the panel to the frame
	    super.setVisible(true);                                                 //Makes the window visible
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        MyWindow2 myWindow2 = new MyWindow2("My Simple Window");               //Creates an instance of this class
    }

}
