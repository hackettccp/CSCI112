package SampleCode5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

/**
 *  The MenuExample class demonstrates a menu system.
 */
public class MenuExample extends JFrame implements ActionListener {
   
    JLabel messageLabel;
    JRadioButtonMenuItem blackItem;
    JRadioButtonMenuItem redItem;
    JRadioButtonMenuItem blueItem;
    JCheckBoxMenuItem visibleItem;

    /**
     * Constructor for creating an instance of this class
     */
    public MenuExample(String titleIn) {
        super(titleIn);                                                                                                 //Constructor call; Must be first.
        super.setSize(500, 175);                                                                                        //Sets up this JFrame using its superclass's methods.
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();                                                                                //Creates a JPanel that all other components will be added to

        messageLabel = new JLabel("Use the Text menu to change my color and make me invisible.");                       //Creates a label.
        mainPanel.add(messageLabel);                                                                                    //Adds the label to the main panel.

        JMenuBar menuBar = new JMenuBar();                                                                              //Creates a JMenuBar object
        super.setJMenuBar(menuBar);                                                                                     //Sets the frame's menu bar.

        JMenu fileMenu = new JMenu("File");                                                                             //Creates a JMenu object for the File menu.
        menuBar.add(fileMenu);                                                                                          //Adds the file menu to the menu bar.

        JMenuItem exitItem = new JMenuItem("Exit");                                                                     //Creates an Exit menu item.
        fileMenu.add(exitItem);                                                                                         //Adds the Exit menu item to the File menu.

        exitItem.setActionCommand("exit");                                                                              //Sets an action command to the menu item
        exitItem.addActionListener(this);                                                                               //Registers this class as the action listener for the menu item

        JMenu textMenu = new JMenu("Text");                                                                             //Creates a JMenu object for the Text menu.
        menuBar.add(textMenu);                                                                                          //Adds the text menu to the menu bar.

        blackItem = new JRadioButtonMenuItem("Black", true);                                                            //Creates the radio button menu items to change the color of the text.
        redItem = new JRadioButtonMenuItem("Red");
        blueItem = new JRadioButtonMenuItem("Blue");

        ButtonGroup group = new ButtonGroup();                                                                          //Creates a button group for the radio button items.
        group.add(blackItem);
        group.add(redItem);
        group.add(blueItem);

        blackItem.setActionCommand("color");                                                                            //Sets action commands to the menu items
        redItem.setActionCommand("color");
        blueItem.setActionCommand("color");

        blackItem.addActionListener(this);                                                                              //Registers this class as the action listener for the menu items
        redItem.addActionListener(this);
        blueItem.addActionListener(this);

        textMenu.add(blackItem);                                                                                        //Adds the menu items to the Text menu.
        textMenu.add(redItem);
        textMenu.add(blueItem);

        visibleItem = new JCheckBoxMenuItem("Visible", true);                                                           //Creates a check box menu item to make the text visible or invisible.
        visibleItem.setActionCommand("visible");                                                                        //Sets an action command to the menu item
        visibleItem.addActionListener(this);                                                                            //Registers this class as the action listener for the menu item
        textMenu.addSeparator();                                                                                        //Adds a separator bar.
        textMenu.add(visibleItem);                                                                                      //Adds the menu item to the Text menu.

        super.add(mainPanel);                                                                                           //Adds the main panel to the frame
	    super.setVisible(true);                                                                                         //Makes the window visible
   }

    /**
     * Required ActionListener override method.
     * Performs an action when a menu item is selected.
     */
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("exit")) {                                                                       //End Program
            System.exit(0);
        }
        else if(e.getActionCommand().equals("color")) {                                                                 //Determine which color was selected and act accordingly.
            if (blackItem.isSelected()) {
                messageLabel.setForeground(Color.BLACK);
            }
            else if (redItem.isSelected()) {
                messageLabel.setForeground(Color.RED);
            }
            else if (blueItem.isSelected()) {
                messageLabel.setForeground(Color.BLUE);
            }
        }
        else if(e.getActionCommand().equals("visible")) {                                                               //Determine the state and act accordingly.
            if (visibleItem.isSelected()) {
                messageLabel.setVisible(true);
            }
            else {
                messageLabel.setVisible(false);
            }
        }
       
   }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        MenuExample w = new MenuExample("Menu Example");                                                                //Creates an instance of this class
    }

}
