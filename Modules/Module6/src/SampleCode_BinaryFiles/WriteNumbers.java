package SampleCode_BinaryFiles;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This program opens a binary file and writes the contents of an int array to the file.
 *
 * The output file will be in this SampleCode_BinaryFiles folder when the program is finished running.
 * Afterwards, try opening this Numbers.dat file as a text document. (It should look look like a bunch of strange characters)
 *
 */
public class WriteNumbers {

   /**
    * Main Method. This is where the program begins.
    */
   public static void main(String[] args) {
      int[] numbers = { 2, 4, 6, 8, 10, 12, 14 };                                                                    //Creates an array of integers.

      DataOutputStream outputFile = null;

      try {
         FileOutputStream fstream = new FileOutputStream("src\\SampleCode_BinaryFiles\\Numbers.dat");                //Open a binary file for output.
         outputFile = new DataOutputStream(fstream);

         System.out.println("Writing to the file...");
         for(int i = 0; i < numbers.length; i++) {                                                                  //Write each array element to the binary file.
            outputFile.writeInt(numbers[i]);
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
