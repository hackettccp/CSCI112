package SampleCode_BinaryFiles;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * This program reads UTF-8 encoded strings from a binary file.
 *
 * !!!Run WriteMixed.java First!!!
 *
 */
public class ReadMixed {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        DataInputStream inputFile = null;

        try {
            FileInputStream fstream = new FileInputStream("src\\SampleCode_BinaryFiles\\mixed.dat");      //Open mixed.dat as a binary file.
            inputFile = new DataInputStream(fstream);

            System.out.println("Reading the data from the file:");
            System.out.println("First Value: " + inputFile.readInt());
            System.out.println("Second Value: " + inputFile.readChar());

            double value3 = inputFile.readDouble();                                                       //Data is stored in variables for values 3 and 4
            System.out.println("Third Value: " + value3);
            String value4 = inputFile.readUTF();
            System.out.println("Fourth Value: " + value4);

            System.out.println("Fifth Value: " + inputFile.readInt());
            System.out.println("Sixth Value: " + inputFile.readDouble());
        }
        catch(IOException e) {
            System.out.println("Problem Reading from File.");
        }
        finally {
            try {
                inputFile.close();                                                                        //Close the file.
            }
            catch(IOException e) {
                //File wasn't open; Do nothing.
            }
        }
        System.out.println("\nDone.");
    }

}
