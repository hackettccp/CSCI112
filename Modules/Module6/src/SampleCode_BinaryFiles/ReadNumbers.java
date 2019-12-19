package SampleCode_BinaryFiles;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *  This program opens a binary file, then reads and displays the contents.
 *
 *  !!!Run WriteNumbers.java First!!!
 */
public class ReadNumbers {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int number;                                                                                         //Used to hold each number from the file
        DataInputStream inputFile = null;

        try {
            FileInputStream fstream = new FileInputStream("src\\SampleCode_BinaryFiles\\Numbers.dat");      //Open Numbers.dat as a binary file.
            inputFile = new DataInputStream(fstream);

            System.out.println("Reading numbers from the file:");
            while(true) {                                                                                   //Read data from the file.
                try {
                    number = inputFile.readInt();                                                           //Get the next int from the file.
                    System.out.println("int read from file: " + number);
                }
                catch (EOFException e) {                                                                    //End of File Reached
                    break;                                                                                  //Stop trying to read file/breaks from loop
                }
            }
        }
        catch(IOException e) {
            System.out.println("Problem Reading from File.");
        }
        finally {
            try {
                inputFile.close();                                                                          //Close the file.
            }
            catch(IOException e) {
                //File wasn't open; Do nothing.
            }
        }
        System.out.println("\nDone.");
    }
}
