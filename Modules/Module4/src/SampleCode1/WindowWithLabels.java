package SampleCode1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Subclass of a JFrame.
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class WindowWithLabels extends JFrame {

    /**
     * Constructor for creating an instance of this class
     */
    public WindowWithLabels(String titleIn) {
        super(titleIn);                                                             //Constructor call; Must be first.
        super.setSize(350, 250);                                                    //Sets up this JFrame using its superclass's methods.
	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();                                            //Creates a JPanel that all other components will be added to

        JLabel labelA = new JLabel("Hello World!");                                 //Creates three JLabels. These will be added to the main JPanel
        JLabel labelB = new JLabel("This is a label.");
        JLabel labelC = new JLabel("This is another label.");

        mainPanel.add(labelA);                                                      //Adds the three labels to the main panel
        mainPanel.add(labelB);
        mainPanel.add(labelC);

        super.add(mainPanel);                                                       //Adds the panel to the frame
	    super.setVisible(true);                                                     //Makes the window visible
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        WindowWithLabels w = new WindowWithLabels("My Simple Window");               //Creates an instance of this class
    }
    
}
