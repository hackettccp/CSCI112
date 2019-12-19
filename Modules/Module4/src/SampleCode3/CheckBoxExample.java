package SampleCode3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Subclass of a JFrame that also implements ActionListener.
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class CheckBoxExample extends JFrame implements ActionListener {

    /**
     * These checkboxes should be instance variables so they can be accessed in any method.
     */
    private JCheckBox check1;
    private JCheckBox check2;
    private JCheckBox check3;
    private JCheckBox check4;

    /**
     * Constructor for creating an instance of this class
     */
    public CheckBoxExample(String titleIn) {
        super(titleIn);                                                             //Constructor call; Must be first.
        super.setSize(350,120);                                                     //Sets up this JFrame using its superclass's methods.
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();                                                //Instantiate a panel to hold the check boxes

        check1 = new JCheckBox("Option 1");                                         //Instantiate 4 check boxes
        check2 = new JCheckBox("Option 2");
        check3 = new JCheckBox("Option 3");
        check4 = new JCheckBox("Option 4");

        JButton button = new JButton("Submit");                                     //Instantiate a button
        button.addActionListener(this);                                             //Add an ActionListener to the button (we're implementing ActionListener in this class)

        panel.add(check1);                                                          //Add the check boxes and button to the panel
        panel.add(check2);
        panel.add(check3);
        panel.add(check4);
        panel.add(button);

        super.add(panel);                                                           //Add the panel to the frame
        super.setVisible(true);                                                     //Makes the window visible
    }

    /**
     * Required ActionListener override method.
     * Opens a dialog box when an ActionEvent occurs.
     * The dialog indicates which check boxes are selected.
     */
    public void actionPerformed(ActionEvent e) {
        String message = "You selected:\n";
        if(check1.isSelected()) {
            message += "Option 1\n";
        }
        if(check2.isSelected()) {
            message += "Option 2\n";
        }
        if(check3.isSelected()) {
            message += "Option 3\n";
        }
        if(check4.isSelected()) {
            message += "Option 4\n";
        } 
        if(!check1.isSelected() && 
           !check2.isSelected() &&
           !check3.isSelected() &&
           !check4.isSelected()) {
            message += "No Options";
        }
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        CheckBoxExample w = new CheckBoxExample("Checkbox Example");                //Creates an instance of this class
    }

}
