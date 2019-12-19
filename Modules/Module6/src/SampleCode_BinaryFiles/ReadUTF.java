package SampleCode_BinaryFiles;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * This program reads UTF-8 encoded strings from a binary file.
 *
 * !!!Run WriteUTF.java First!!!
 *
 */
public class ReadUTF {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String name;                                                                                         //Used to hold each name/String from the file
        DataInputStream inputFile = null;

        try {
            FileInputStream fstream = new FileInputStream("src\\SampleCode_BinaryFiles\\UTFnames.dat");      //Open UTFnames.dat as a binary file.
            inputFile = new DataInputStream(fstream);

            System.out.println("Reading the names from the file:");
            while(true) {                                                                                    //Read data from the file.
                try {
                    name = inputFile.readUTF();                                                              //Get the next String from the file.
                    System.out.println("String read from file: " + name);
                }
                catch (EOFException e) {                                                                     //End of File Reached
                    break;                                                                                   //Stop trying to read file/breaks from loop
                }
            }
        }
        catch(IOException e) {
            System.out.println("Problem Reading from File.");
        }
        finally {
            try {
                inputFile.close();                                                                           //Close the file.
            }
            catch(IOException e) {
                //File wasn't open; Do nothing.
            }
        }
        System.out.println("\nDone.");
    }

}
