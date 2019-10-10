package Lab;

import java.util.Scanner;

/**
 * Fix this program so it does not crash when the user enters a non-integer value.
 * For example, 5.6 or "dog"
 * 
 * In addition to printing an error message, print the exception's message.
 * 
 * Only make changes inside the while loop below.
 */
class UserInput {

    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int userNumber = 0;
        
        while(true) {
            
            System.out.println("Enter a number: ");
            userNumber = Integer.parseInt(keyboard.nextLine());
            if(userNumber < 1) {
                System.out.println("Error. Number must be greater than zero.");
            }
            else {
                break;
            }
            
        }
    }
}
