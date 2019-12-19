package SampleCode.c_abstract_classes;

/**
 * Owl Object.
 * Subclass of abstract Bird object.
 */
public final class Owl extends Bird {
    
    /**
     * Constructor with one argument
     */ 
    public Owl(String colorIn) {
        super(colorIn);
    }

    /**
     * Prints a "sound".
     * Method required by the abstract superclass.
     */
    public void birdCall() {
        System.out.println("Hoot!");
    }

}

