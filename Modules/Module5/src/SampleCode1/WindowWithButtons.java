package SampleCode1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Subclass of a JFrame.
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class WindowWithButtons extends JFrame {

    /**
     * Constructor for creating an instance of this class
     */
    public WindowWithButtons(String titleIn) {
        super(titleIn);                                                                 //Constructor call; Must be first.
        super.setSize(350, 250);                                                        //Sets up this JFrame using its superclass's methods.
	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();                                                //Creates a JPanel that all other components will be added to

        JButton buttonA = new JButton("Button 1");                                      //Creates three JButtons. These will be added to the main JPanel
        JButton buttonB = new JButton("Button 2");
        JButton buttonC = new JButton("Button 3");

        mainPanel.add(buttonA);                                                         //Adds the three buttons to the main panel
        mainPanel.add(buttonB);
        mainPanel.add(buttonC);

        super.add(mainPanel);                                                           //Adds the panel to the frame
	    super.setVisible(true);                                                         //Makes the window visible
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        WindowWithButtons w = new WindowWithButtons("My Simple Window");               //Creates an instance of this class
    }
    
}
