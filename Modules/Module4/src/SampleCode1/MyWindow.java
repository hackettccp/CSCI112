package SampleCode1;

import javax.swing.JFrame;

/**
 * Subclass of a JFrame.
 * All functionality related to this object/window 
 * is contained in this class.
 */
public class MyWindow extends JFrame {

    /**
     * Constructor for creating an instance of this class
     */
    public MyWindow(String titleIn) {
        super(titleIn);                                                     //Superclass constructor call; Must be first.
        super.setSize(350, 250);                                            //Sets up this JFrame using its superclass's methods.
	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    super.setVisible(true);
    }

    /**
     * Main Method. The program begins here.
     */
    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow("My Simple Window");               //Creates an instance of this class
    }
    
}
