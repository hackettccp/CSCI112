package SampleCode3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


/**
 * Subclass of a JFrame that also implements ActionListener.
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class RadioButtonExample extends JFrame implements ActionListener {

    /**
     * These radio buttons should be instance variables so they can be accessed in any method.
     */
    private JRadioButton radio1;
    private JRadioButton radio2;
    private JRadioButton radio3;
    private JRadioButton radio4;

    /**
     * Constructor for creating an instance of this class
     */
    public RadioButtonExample(String titleIn) {
        super(titleIn);                                                                         //Constructor call; Must be first.
        super.setSize(350,120);                                                                 //Sets up this JFrame using its superclass's methods.
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();                                                            //Instantiate a panel to hold the radio buttons

        radio1 = new JRadioButton("Option 1");                                                  //Instantiate 4 radio buttons
        radio2 = new JRadioButton("Option 2");
        radio3 = new JRadioButton("Option 3");
        radio4 = new JRadioButton("Option 4");

        ButtonGroup rGroup = new ButtonGroup();                                                 //Group the radio buttons together
        rGroup.add(radio1);
        rGroup.add(radio2);
        rGroup.add(radio3);
        rGroup.add(radio4);

        JButton button = new JButton("Get Option");                                             //Instantiate a button
        button.addActionListener(this);                                                         //Add an ActionListener to the button (we're implementing ActionListener in this class)

        panel.add(radio1);                                                                      //Add the radio buttons and button to the panel
        panel.add(radio2);
        panel.add(radio3);
        panel.add(radio4);
        panel.add(button);

        super.add(panel);                                                                       //Add the panel to the frame
        super.setVisible(true);                                                                 //Makes the window visible
    }

    /**
     * Required ActionListener override method.
     * Opens a dialog box when an ActionEvent occurs.
     * The dialog indicates which radio button is selected.
     */
    public void actionPerformed(ActionEvent e) {
        if(radio1.isSelected()) {
                JOptionPane.showMessageDialog(null, "You picked option 1!");
        }
        else if(radio2.isSelected()) {
                JOptionPane.showMessageDialog(null, "You picked option 2!");
        }
        else if(radio3.isSelected()) {
                JOptionPane.showMessageDialog(null, "You picked option 3!");
        }
        else if(radio4.isSelected()) {
                JOptionPane.showMessageDialog(null, "You picked option 4!");
        }
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        RadioButtonExample w = new RadioButtonExample("Radio Button Example");                //Creates an instance of this class
    }

}
