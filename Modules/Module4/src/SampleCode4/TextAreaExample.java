package SampleCode4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Subclass of a JFrame that also implements ActionListener.
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class TextAreaExample extends JFrame implements ActionListener {

    /**
     * This text area should be an instance variable so it can be accessed in any method.
     */
    JTextArea textArea;

    /**
     * Constructor for creating an instance of this class
     */
    public TextAreaExample(String titleIn) {
        super(titleIn);                                                                             //Constructor call; Must be first.
        super.setSize(350, 250);                                                                    //Sets up this JFrame using its superclass's methods.
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();                                                             //Creates two panels for displaying a text area and a button.
        JPanel bottomPanel = new JPanel();

        textArea = new JTextArea(5, 25);                                                            //Creates the text area. Five lines in height, 25 in width.
        textArea.setLineWrap(true);                                                                 //Turns on Line Wrapping
        textArea.setWrapStyleWord(true);                                                            //Turns on Word Wrapping

        JScrollPane jsp = new JScrollPane(textArea);                                                //Adds the Text Area to a Scroll Pane
        topPanel.add(jsp);                                                                          //Adds the Scroll Pane to the top panel

        JButton button = new JButton("Get Text Area Text");                                         //Creates a button that will retrieve the text in the text area.
        button.addActionListener(this);                                                             //Registers this class as the button's action listener

        bottomPanel.add(button);                                                                    //Adds the button to the bottom panel

        super.add(topPanel);                                                                        //Adds the panels to the frame
        super.add(bottomPanel, BorderLayout.SOUTH);
        super.setVisible(true);                                                                     //Makes the window visible
    }

    /**
     * Required ActionListener override method.
     * Prints the contents of the text area to the console
     */
    public void actionPerformed(ActionEvent e) {
        System.out.println(textArea.getText());
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        TextAreaExample w = new TextAreaExample("Text Area Example");                               //Creates an instance of this class
    }

}
