package SampleCode.c_abstract_classes;

/**
 * Abstract Bird Object.
 */
public abstract class Bird {
    
    private String color;                               //The bird's color
    
    /**
     * Constructor with one argument.
     */
    public Bird(String colorIn) {
        color = colorIn;
    }

    /**
     * Prints a bird call.
     * Must be implemented by its subclass.
     */
    public abstract void birdCall();
    
    /**
     * Retrieves the color field.
     */
    public String getColor() {
        return color;
    }

}
