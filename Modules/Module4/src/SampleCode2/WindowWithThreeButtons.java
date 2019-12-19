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
public class WindowWithThreeButtons extends JFrame implements ActionListener {

    /**
     * Constructor for creating an instance of this class
     */
    public WindowWithThreeButtons(String titleIn) {
        super(titleIn);                                                                             //Constructor call; Must be first.
        super.setSize(350, 250);                                                                    //Sets up this JFrame using its superclass's methods.
	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();                                                            //Creates a JPanel that all other components will be added to

        JButton buttonA = new JButton("Button A");                                                  //Creates three JButtons. They will be added to the main JPanel
        JButton buttonB = new JButton("Button B");
        JButton buttonC = new JButton("Button C");

        buttonA.setActionCommand("buttonA pressed");                                                //Adds unique Action Commands to each button
        buttonB.setActionCommand("buttonB pressed");
        buttonC.setActionCommand("buttonC pressed");

        buttonA.addActionListener(this);                                                            //Registers an ActionListener to the JButtons. We can register this class, because it is implementing the ActionListener interface.
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);

        mainPanel.add(buttonA);                                                                     //Adds the buttons to the main panel
        mainPanel.add(buttonB);
        mainPanel.add(buttonC);

        super.add(mainPanel);                                                                       //Adds the panel to the frame
	    super.setVisible(true);                                                                     //Makes the window visible
    }
    
    /**
     * Required ActionListener override method.
     * Simply opens a dialog box when an ActionEvent occurs.
     * Uses action commands to tell the buttons apart from each other.
     */
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("buttonA pressed")) {
            JOptionPane.showMessageDialog(null, "You clicked Button A!");
        }
        else if(e.getActionCommand().equals("buttonB pressed")) {
            JOptionPane.showMessageDialog(null, "You clicked Button B!");
        }
        else if(e.getActionCommand().equals("buttonC pressed")) {
            JOptionPane.showMessageDialog(null, "You clicked Button C!");
        }
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        WindowWithThreeButtons w = new WindowWithThreeButtons("Action Command Example");             //Creates an instance of this class
    }

}
