package SampleCode_BinaryFiles;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This program opens a binary file and writes a series of strings
 * using UTF-8 encoding.
 *
 * The output file will be in this SampleCode_BinaryFiles folder when the program is finished running.
 * Afterwards, try opening this UTFnames.dat file as a text document. (The text should be visible, but each is
 * preceded by a strange character (review slides on writing UTF data for the reason why))
 */
public class WriteUTF {

   /**
    * Main Method. This is where the program begins.
    */
   public static void main(String[] args) {
      String names[] = { "Warren", "Becky", "Holly", "Chloe" };                                                      //Creates an array of Strings.

      DataOutputStream outputFile = null;

      try {
         FileOutputStream fstream = new FileOutputStream("src\\SampleCode_BinaryFiles\\UTFnames.dat");               //Open a binary file for output.
         outputFile = new DataOutputStream(fstream);

         System.out.println("Writing the names to the file...");
         for(int i = 0; i < names.length; i++) {                                                                    //Write each array element to the binary file.
            outputFile.writeUTF(names[i]);
         }
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
