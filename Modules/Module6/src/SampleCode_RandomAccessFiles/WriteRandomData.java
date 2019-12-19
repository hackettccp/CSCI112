package SampleCode_RandomAccessFiles;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *  This program uses a RandomAccessFile object to create
 *  the file RandomAccessFile.dat. The letters of the alphabet are
 *  written to the file, in addition to the numbers 1 through 10.
 */
public class WriteRandomData {

   /**
    * Main Method. This is where the program begins.
    */
   public static void main(String[] args) {
      char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                         'h', 'i', 'j', 'k', 'l', 'm', 'n',
                         'o', 'p', 'q', 'r', 's', 't', 'u',
                         'v', 'w', 'x', 'y', 'z' };

      RandomAccessFile randomFile = null;

      try {
         randomFile = new RandomAccessFile("src\\SampleCode_RandomAccessFiles\\RandomAccessFile.dat", "rw");            //Open a binary file for output.

         System.out.println("Writing the data to the file...");

         for(int i = 0; i < letters.length; i++) {                                                                      //Sequentially write the letters array to the file.
            randomFile.writeChar(letters[i]);
         }

         for(int i = 1; i < 11; i++) {                                                                                  //Sequentially write the numbers 1-10 to the file.
            randomFile.writeInt(i);
         }
      }
      catch(IOException e) {
         System.out.println("Problem Writing to File.");
      }
      finally {
         try {
            randomFile.close();                                                                                         //Close the file.
         }
         catch(IOException e) {
            //File wasn't open; Do nothing.
         }
      }
      System.out.println("\nDone.");
   }
}
