package SampleCode;

import java.util.Scanner;

/**
 * This program purposely causes Exceptions but handles
 * it so it does not crash the program.
 */
class a_TryCatch {

    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String strArray[] = {"index_zero", "index_one", "index_two"};           //An array of strings used in a few examples below

        try {
            System.out.println(strArray[3]);                                    //Attempts to access index 3. Will cause an ArrayIndexOutOfBoundsException
        } 
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index out of range");
        }

        try {
            int example = Integer.parseInt(strArray[0]);                        //Attempts to convert a non-numeric string to an in. Will cause a NumberFormatException
        } 
        catch (NumberFormatException ex) {
            System.out.println("Not a numeric value");
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a fractional value (ie. 5.5): ");
        try {
            double example2 = Double.parseDouble(keyboard.nextLine());          //Attempts to convert the user's input to a double. Will cause a NumberFormatException if non-numeric.
        } 
        catch (NumberFormatException ex) {
            System.out.println("Not a numeric value");
        }

        System.out.println("Program Complete");
    }

}
