package SampleCode4;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Subclass of a JFrame that also implements ActionListener.
 * (This is a little different from what was shown in the slides)
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class MultiplePanelWindow extends JFrame implements ActionListener {

    /**
     * These text fields should be instance variables so they can be accessed in any method.
     */
    private JTextField field;
    private JTextField field2;

    /**
     * Constructor for creating an instance of this class
     */
    public MultiplePanelWindow(String titleIn) {
        super(titleIn);                                                                                                 //Constructor call; Must be first.
        super.setSize(350, 150);                                                                                        //Sets up this JFrame using its superclass's methods.
	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();                                                                                //Creates a JPanel that two other panels will be added to

        JPanel topPanel = new JPanel();                                                                                 //Creates two additional panels (topPanel will use GridLayout)
        JPanel bottomPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2,1));

        JLabel label = new JLabel("Enter your text: ");                                                                 //Creates the Labels and Text Fields
        field = new JTextField(15);
        JLabel label2 = new JLabel("Enter more text: ");
        field2 = new JTextField(15);

        JPanel rowOnePanel = new JPanel();                                                                              //Panels for each cell in the grid
        JPanel rowTwoPanel = new JPanel();

        rowOnePanel.add(label);                                                                                         //Adds them to the two row panels
        rowOnePanel.add(field);
        rowTwoPanel.add(label2);
        rowTwoPanel.add(field2);

        topPanel.add(rowOnePanel);                                                                                      //Adds the two row panels to the top panel
        topPanel.add(rowTwoPanel);

        JButton okButton = new JButton("OK");                                                                           //Creates the two buttons
        JButton resetButton = new JButton("Reset");

        okButton.setActionCommand("ok");                                                                                //Sets Action Commands to the buttons so we can tell them apart
        resetButton.setActionCommand("reset");

        okButton.addActionListener(this);                                                                               //Registers an ActionListener to the JButtons. We can register this class, because it is implementing the ActionListener interface.
        resetButton.addActionListener(this);

        bottomPanel.add(okButton);                                                                                      //Adds the buttons to the bottom panel
        bottomPanel.add(resetButton);

        mainPanel.setLayout(new BorderLayout());                                                                        //Sets mainPanel to use BorderLayout and adds the two panels to it
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.CENTER);

        super.add(mainPanel);                                                                                           //Adds the main panel to the frame
	    super.setVisible(true);                                                                                         //Makes the window visible
    }
    
    /**
     * Required ActionListener override method.
     * Uses action commands to tell the buttons apart.
     */
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("ok")) {                                                                         //User pressed OK button. Displays the user's text in a message dialog
            JOptionPane.showMessageDialog(null, "You entered " + field.getText() + "\n" + field2.getText());
        }
        else if(e.getActionCommand().equals("reset")) {                                                                 //User pressed Reset button. Sets the text fields to empty
            field.setText("");
            field2.setText("");
        }
        
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        MultiplePanelWindow w = new MultiplePanelWindow("Multiple Panel Example");                                      //Creates an instance of this class
    }
    
}
