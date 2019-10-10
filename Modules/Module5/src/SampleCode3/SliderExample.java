package SampleCode3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 * Subclass of a JFrame that also implements ActionListener.
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class SliderExample extends JFrame implements ActionListener {

    /**
     * This slider should be an instance variable so it can be accessed in any method.
     */
    JSlider slider;

    /**
     * Constructor for creating an instance of this class
     */
    public SliderExample(String titleIn) {
        super(titleIn);                                                                         //Constructor call; Must be first.
        super.setSize(350,100);                                                                 //Sets up this JFrame using its superclass's methods.
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();                                                            //Panel to hold the label and slider

        JButton getValueButton = new JButton("Get Value");                                      //Instantiates a button

        slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 5);                                     //Instantiate the slider: Horizontal, Min = 0, Max = 10, Start Value = 5
        slider.setPaintTicks(true);                                                             //Enables tick marks
        slider.setMajorTickSpacing(5);                                                          //Sets the major ticks to every 5
        slider.setMinorTickSpacing(1);                                                          //Sets the minor ticks to every 1
        slider.setPaintLabels(true);                                                            //Displays the numbers on the major ticks

        getValueButton.addActionListener(this);                                                 //Registers an ActionListener to the button

        panel.add(slider);                                                                      //Add the slider and button to the panel
        panel.add(getValueButton);

        super.add(panel);                                                                       //Add the panel to the frame
        super.setVisible(true);                                                                 //Makes the window visible
    }

    /**
     * Required ActionListener override method.
     * Opens a dialog box when an ActionEvent occurs.
     * The dialog indicates what value the slider is set to.
     */
    public void actionPerformed(ActionEvent e) {
        int currentValue = slider.getValue();                                                   //Get the current value of the slider
        JOptionPane.showMessageDialog(this, "Slider's current value = " + currentValue);        //Display Message Dialog
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        SliderExample w = new SliderExample("Slider Example");                                  //Creates an instance of this class
    }

}
