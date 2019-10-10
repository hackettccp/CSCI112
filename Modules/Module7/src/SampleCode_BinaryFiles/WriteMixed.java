package SampleCode_BinaryFiles;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This program opens a binary file and writes different types of data.
 *
 * The output file will be in this SampleCode_BinaryFiles folder when the program is finished running.
 * Afterwards, try opening this mixed.dat file as a text document.
 * (Some text should be visible, but much will be strange characters)
 */
public class WriteMixed {

   /**
    * Main Method. This is where the program begins.
    */
    public static void main(String[] args) {
        DataOutputStream outputFile = null;

        try {
            FileOutputStream fstream = new FileOutputStream("src\\SampleCode_BinaryFiles\\mixed.dat");               //Open a binary file for output.
            outputFile = new DataOutputStream(fstream);

            System.out.println("Writing the data to the file...");

            outputFile.writeInt(800);
            outputFile.writeChar('Z');
            outputFile.writeDouble(45.23);
            outputFile.writeUTF("Hello World");
            outputFile.writeInt(23);
            outputFile.writeDouble(6.5);
        }
        catch(IOException e) {
            System.out.println("Problem Writing to File.");
        }
        finally {
            try {
               outputFile.close();                                                                                      //Close the file.
            }
            catch(IOException e) {
               //File wasn't open; Do nothing.
            }
        }
        System.out.println("Done.");
    }

}
