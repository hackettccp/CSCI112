package SampleCode_RandomAccessFiles;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *  This program uses the RandomAccessFile class
 *  to open the file RandomAccessFile.dat and randomly read
 *  letters and numbers from different locations.
 */
public class ReadRandomData {

   /**
    * Main Method. This is where the program begins.
    */
   public static void main(String[] args) {
      RandomAccessFile randomFile = null;

      try {
         randomFile = new RandomAccessFile("src\\SampleCode_RandomAccessFiles\\RandomAccessFile.dat", "r");             //Open a binary file for input.

         System.out.println("Reading data from the file...");

         /**
          * Move to character 4 ('e'). (File starts with byte/character 0, which is 'a')
          * The chars (first 26 values of the file (0-25)) are 2 bytes each
          * 4 * 2 = 8
          */
         randomFile.seek(8);
         char ch = randomFile.readChar();
         System.out.println("Char starting at byte 10: " + ch);

         /**
          * Get current pointer position
          * Was at byte 8, got a 2-byte char (8-9), should be at byte 10 now
          */
         System.out.println("Pointer's current position: " + randomFile.getFilePointer());


         System.out.println();

         /**
          * Move to character 12 ('m').
          * The chars (first 26 values of the file) are 2 bytes each
          * 12 * 2 = 24
          */
         randomFile.seek(24);
         ch = randomFile.readChar();
         System.out.println("Char starting at byte 24: " + ch);

         /**
          * Get current pointer position
          * Was at byte 24, got a 2-byte char (24-25), should be at byte 26 now
          */
         System.out.println("Pointer's current position: " + randomFile.getFilePointer());


         System.out.println();


         /**
          * Move to character 29 (3).
          * The chars (first 26 values of the file) are 2 bytes each (we start with zero, so 0 through 25)
          * (25 * 2) = 50 ('z' which takes up bytes 50-51)
          * The ints (last 10 values of the file) are 4 bytes each starting at byte 52
          * 52 + 0 * 4 = 52   (1)
          * 52 + 1 * 4 = 56   (2)
          * 52 + 2 * 4 = 60   (3)
          */
         randomFile.seek(60);
         int num = randomFile.readInt();
         System.out.println("Int starting at byte 60: " + num);

         /**
          * Get current pointer position
          * Was at byte 60, got a 4-byte int (60-63), should be at byte 64 now
          */
         System.out.println("Pointer's current position: " + randomFile.getFilePointer());


         System.out.println();


         /**
          * Move back to character 16 ('q').
          * The chars (first 26 values of the file) are 2 bytes each
          * 16 * 2 = 32
          */
         randomFile.seek(32);
         ch = randomFile.readChar();
         System.out.println("Char starting at byte 16: " + ch);

         /**
          * Get current pointer position
          * Was at byte 32, got a 2-byte char (32-33), should be at byte 34 now
          */
         System.out.println("Pointer's current position: " + randomFile.getFilePointer());

      }
      catch(IOException e) {
         System.out.println("Problem Reading from the File.");
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
