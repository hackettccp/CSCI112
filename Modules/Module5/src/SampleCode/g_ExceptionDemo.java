package SampleCode;

import java.util.Scanner;

/**
 * This program demonstrates using a custom Exception subclass.
 */
public class g_ExceptionDemo {

    private static Scanner keyboard;                                                     //Class-wide so both static methods can get keyboard input.

    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        while(true) {
            try {
                int x = prompter();                                                      //Calls the prompter() method which should return an int
                break;                                                                   //As long as the prompter() method returns normally, this line will be reached and the loop will end
            }
            catch(HackettException e) {
                System.out.println(e.getMessage());
                System.out.print("Print exception's stack trace? (y or Y): ");           //Asks if the user wants to print a stack trace.
                String input = keyboard.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    e.printStackTrace();
                }
                System.out.println("Try again.");
            }
        }
    }

    /**
     * Method that prompts for the user to enter an integer.
     * Does a series of checks on the value entered.
     * Will throw exceptions for different reasons (in this case, leaving it up to the main method to deal with the problem)
     *
     * The throws clause is required because the method's code may throw this type of exception.
     */
    public static int prompter() throws HackettException {
        int number = 0;
        System.out.print("Enter an integer: ");

        try {
            number = Integer.parseInt(keyboard.nextLine());                         //Checks the value entered is an integer.
        }
        catch(NumberFormatException e) {
            throw new HackettException("Not an integer.");                          //Throws a HackettException if the value entered is not an integer
        }

        if(number < 0) {
            throw new HackettException("No negative integers.");                    //Throws a HackettException if the integer is negative
        }
        else if(number > 100) {
            throw new HackettException("No integers greater than 100");             //Throws a HackettException if the integer is greater than 100
        }
        else if(number % 2 == 0) {
            throw new HackettException("No even integers.");                        //Throws a HackettException if the integer is even
        }

        return number;                                                              //If it made it this far, it returns the integer

    }

}
