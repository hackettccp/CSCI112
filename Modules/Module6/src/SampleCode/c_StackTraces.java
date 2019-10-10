package SampleCode;

import java.util.Scanner;

/**
 * Demonstrates printing an exception's stack trace
 */
class c_StackTraces {

    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a fractional value (ie. 5.5): ");
        
        try {
            double example2 = Double.parseDouble(keyboard.nextLine());              //To cause an exception, enter a non-numeric string when prompted.
        } 
        catch (NumberFormatException ex) {
            ex.printStackTrace();                                                   //Prints the stack trace of the exception
        }

        System.out.println("\nProgram Complete");                                   //Program is still running. It didn't crash, only printed the stack trace.
    }

}
