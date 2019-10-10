package SampleCode2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Subclass of a JFrame that also implements ActionListener.
 * (This is a little different from what was shown in the slides)
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class WindowWithOneButton extends JFrame implements ActionListener {

    /**
     * Constructor for creating an instance of this class
     */
    public WindowWithOneButton(String titleIn) {
        super(titleIn);                                                                         //Constructor call; Must be first.
        super.setSize(350, 250);                                                                //Sets up this JFrame using its superclass's methods.
	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();                                                        //Creates a JPanel that all other components will be added to

        JButton buttonA = new JButton("Click Here!");                                           //Creates a JButton. It will be added to the main JPanel
        buttonA.addActionListener(this);                                                        //Registers an ActionListener to the JButton. We can register THIS class, because it is implementing the ActionListener interface.

        mainPanel.add(buttonA);                                                                 //Adds the button to the main panel

        super.add(mainPanel);                                                                   //Adds the panel to the frame
	    super.setVisible(true);                                                                 //Makes the window visible
    }
    
    /**
     * Required ActionListener override method.
     * Simply opens a dialog box when an ActionEvent occurs.
     */
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "You clicked the button!");
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        WindowWithOneButton w = new WindowWithOneButton("Action Listener Example");             //Creates an instance of this class
    }
}
