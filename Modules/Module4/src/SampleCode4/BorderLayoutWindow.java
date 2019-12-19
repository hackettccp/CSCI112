package SampleCode4;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Subclass of a JFrame that also implements ActionListener.
 * (This is a little different from what was shown in the slides)
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class BorderLayoutWindow extends JFrame {

    /**
     * Constructor for creating an instance of this class
     */
    public BorderLayoutWindow(String titleIn) {
        super(titleIn);                                                                                 //Constructor call; Must be first.
        super.setSize(350, 250);                                                                        //Sets up this JFrame using its superclass's methods.
	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();                                                                //Creates a JPanel that all other components will be added to
        mainPanel.setLayout(new BorderLayout());                                                        //Sets the layout of mainPanel for demonstration

        JButton buttonA = new JButton("Button A");                                                      //Creates five JButtons. They will be added to the main JPanel
        JButton buttonB = new JButton("Button B");
        JButton buttonC = new JButton("Button C");
        JButton buttonD = new JButton("Button D");
        JButton buttonE = new JButton("Button E");

        mainPanel.add(buttonA, BorderLayout.NORTH);                                                     //Adds the buttons to the main panel
        mainPanel.add(buttonB, BorderLayout.WEST);
        mainPanel.add(buttonC, BorderLayout.CENTER);
        mainPanel.add(buttonD, BorderLayout.EAST);
        mainPanel.add(buttonE, BorderLayout.SOUTH);

        super.add(mainPanel);                                                                           //Adds the panel to the frame
	    super.setVisible(true);                                                                         //Makes the window visible
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        BorderLayoutWindow w = new BorderLayoutWindow("Border Layout Example");                         //Creates an instance of this class
    }
    
}
