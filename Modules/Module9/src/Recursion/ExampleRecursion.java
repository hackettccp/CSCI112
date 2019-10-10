package Recursion;

/**
 * Demonstrates a recursive method.
 */
public class ExampleRecursion {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        message(5);
    }

    /**
     * Method that prints "This is a recursive method."
     */
    public static void message(int x) {
        //System.out.println("Entering. x = " + x);

        System.out.println("This is a recursive method.");
        if(x > 1) {
            message(x - 1);
        }

        //System.out.println("Exiting. x = " + x);
    }

}
