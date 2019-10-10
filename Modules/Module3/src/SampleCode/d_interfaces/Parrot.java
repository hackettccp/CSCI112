package SampleCode.d_interfaces;

/**
 * Parrot Object.
 * (It is a Parrot object, a Bird object, and a TalkingBird object)
 */
public class Parrot extends Bird implements TalkingBird {

    /**
     * Constructor that accepts one argument.
     */
    public Parrot(String colorIn) {
        super(colorIn);
    }

    /**
     * Prints a bird call.
     * (Method required by the Bird abstract class)
     */
    public void birdCall() {
        System.out.println("Squawk!");
    }

    /**
     * Prints a hello message.
     * (Method required by the TalkingBird interface)
     */
    public void sayHello() {
        System.out.println("Hello!");
    }

}

