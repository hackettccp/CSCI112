package SampleCode5;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *  The FontExample class demonstrates different fonts and styles.
 */
public class FontExample extends JFrame {

    /**
     * Constructor for creating an instance of this class
     */
    public FontExample(String titleIn) {
        super(titleIn);                                                                                                 //Constructor call; Must be first.
        super.setSize(350, 600);                                                                                        //Sets up this JFrame using its superclass's methods.
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();                                                                                //Creates a JPanel that all other components will be added to
        mainPanel.setLayout(new GridLayout(15,1));
	    
	    JLabel dialogLabelPlain = new JLabel("Dialog Plain 12pt");
	    dialogLabelPlain.setFont(new Font("Dialog", Font.PLAIN, 12));
	    mainPanel.add(dialogLabelPlain);
        
        JLabel dialogLabelPlain24 = new JLabel("Dialog Plain 24pt");
        dialogLabelPlain24.setFont(new Font("Dialog", Font.PLAIN, 24));
        mainPanel.add(dialogLabelPlain24);
        
        JLabel dialogLabelItalic = new JLabel("Dialog Italic 12pt");
        dialogLabelItalic.setFont(new Font("Dialog", Font.ITALIC, 12));
        mainPanel.add(dialogLabelItalic);
        
        JLabel dialogLabelBold = new JLabel("Dialog Bold 12pt");
        dialogLabelBold.setFont(new Font("Dialog", Font.BOLD, 12));
        mainPanel.add(dialogLabelBold);
        
        JLabel dialogLabelBoldItalic = new JLabel("Dialog Bold Italic 12pt");
        dialogLabelBoldItalic.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 12));
        mainPanel.add(dialogLabelBoldItalic);

        JLabel serifLabelPlain = new JLabel("Serif Plain 12pt");
        serifLabelPlain.setFont(new Font("Serif", Font.PLAIN, 12));
        mainPanel.add(serifLabelPlain);
        
        JLabel serifLabelPlain24 = new JLabel("Serif Plain 24pt");
        serifLabelPlain24.setFont(new Font("Serif", Font.PLAIN, 24));
        mainPanel.add(serifLabelPlain24);
        
        JLabel serifLabelItalic = new JLabel("Serif Italic 12pt");
        serifLabelItalic.setFont(new Font("Serif", Font.ITALIC, 12));
        mainPanel.add(serifLabelItalic);
        
        JLabel serifLabelBold = new JLabel("Serif Bold 12pt");
        serifLabelBold.setFont(new Font("Serif", Font.BOLD, 12));
        mainPanel.add(serifLabelBold);
        
        JLabel serifLabelBoldItalic = new JLabel("Serif Bold Italic 12pt");
        serifLabelBoldItalic.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 12));
        mainPanel.add(serifLabelBoldItalic);

        JLabel monospacedLabelPlain = new JLabel("Monospaced Plain 12pt");
        monospacedLabelPlain.setFont(new Font("Monospaced", Font.PLAIN, 12));
        mainPanel.add(monospacedLabelPlain);
        
        JLabel monospacedLabelPlain24 = new JLabel("Monospaced Plain 24pt");
        monospacedLabelPlain24.setFont(new Font("Monospaced", Font.PLAIN, 24));
        mainPanel.add(monospacedLabelPlain24);
        
        JLabel monospacedLabelItalic = new JLabel("Monospaced Italic 12pt");
        monospacedLabelItalic.setFont(new Font("Monospaced", Font.ITALIC, 12));
        mainPanel.add(monospacedLabelItalic);
        
        JLabel monospacedLabelBold = new JLabel("Monospaced Bold 12pt");
        monospacedLabelBold.setFont(new Font("Monospaced", Font.BOLD, 12));
        mainPanel.add(monospacedLabelBold);
        
        JLabel monospacedLabelBoldItalic = new JLabel("Monospaced Bold Italic 12pt");
        monospacedLabelBoldItalic.setFont(new Font("Monospaced", Font.BOLD + Font.ITALIC, 12));
        mainPanel.add(monospacedLabelBoldItalic);

        super.add(mainPanel);                                                                                           //Adds the main panel to the frame
	    super.setVisible(true);                                                                                         //Makes the window visible
   }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        FontExample w = new FontExample("Font Example");                                                                //Creates an instance of this class
    }

}
