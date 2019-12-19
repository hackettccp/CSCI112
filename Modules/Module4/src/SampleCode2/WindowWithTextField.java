package SampleCode2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Subclass of a JFrame that also implements ActionListener.
 * (This is a little different from what was shown in the slides)
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class WindowWithTextField extends JFrame implements ActionListener {

    /**
     * This text field should be an instance variable so it can be accessed in any method.
     */
    private JTextField field;

    /**
     * Constructor for creating an instance of this class
     */
    public WindowWithTextField(String titleIn) {
        super(titleIn);                                                                     //Constructor call; Must be first.

        super.setSize(350, 250);                                                            //Sets up this JFrame using its superclass's methods.
	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();                                                    //Creates a JPanel that all other components will be added to

        field = new JTextField(15);                                                         //Creates a JTextField. It will be added to the main JPanel

        JButton okButton = new JButton("OK");                                               //Creates two JButtons. They will be added to the main JPanel
        JButton resetButton = new JButton("Reset");

        okButton.setActionCommand("ok");                                                    //Sets Action Commands to the buttons so we can tell them apart
        resetButton.setActionCommand("reset");

        okButton.addActionListener(this);                                                   //Registers an ActionListener to the JButtons. We can register this class, because it is implementing the ActionListener interface.
        resetButton.addActionListener(this);

        mainPanel.add(field);                                                               //Adds the text field to the main panel
        mainPanel.add(okButton);                                                            //Adds the buttons to the main panel
        mainPanel.add(resetButton);

        super.add(mainPanel);                                                               //Adds the panel to the frame
	    super.setVisible(true);                                                             //Makes the window visible
    }
    
    /**
     * Required ActionListener override method.
     * Simply opens a dialog box when an ActionEvent occurs.
     * Uses action commands to tell the buttons apart from each other.
     */
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("ok")) {                                             //User pressed OK button. Displays the user's text in a message dialog
            JOptionPane.showMessageDialog(null, "You entered " + field.getText());
        }
        else if(e.getActionCommand().equals("reset")) {                                     //User pressed Reset button. Sets the text field to empty
            field.setText("");
        }
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        WindowWithTextField w = new WindowWithTextField("Text Field Example");             //Creates an instance of this class
    }
    
}
