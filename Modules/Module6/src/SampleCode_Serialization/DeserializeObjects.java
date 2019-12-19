package SampleCode_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * This program deserializes the objects in the InventoryItemObjects.dat file and stores them in an array.
 *
 * !!!Run SerializeObjects.java First!!!
 */
public class DeserializeObjects {

   /**
    * Main Method. This is where the program begins.
    */
   public static void main(String[] args) {
      InventoryItem[] items = new InventoryItem[3];                                                               //Create an array to hold InventoryItem objects.

      FileInputStream inStream = null;                                                                            //Variables for the stream objects.
      ObjectInputStream objectInputFile = null;

      try {
         inStream = new FileInputStream("src\\SampleCode_Serialization\\InventoryItemObjects.dat");
         objectInputFile = new ObjectInputStream(inStream);                                                       //Instantiates the output stream object.

         for(int i = 0; i < items.length; i++) {
            items[i] = (InventoryItem)objectInputFile.readObject();                                               //Read/Deserialize the object from the file.
         }
      }
      catch(IOException e) {
         System.out.println("Problem writing to file.");
      }
      catch(ClassNotFoundException e) {
         System.out.println("Incorrect Object Type.");                                                            //Checked Exception from readObject method.
      }
      finally {
         try {
            objectInputFile.close();
         }
         catch(IOException e) {
            //Output stream was never opened;Do nothing
         }
      }

      for(int i = 0; i < items.length; i++) {                                                                     //Display the data from each object.
         System.out.println("Item " + (i + 1));
         System.out.println("  Description: " + items[i].description);
         System.out.println("  Units: " + items[i].units);
      }
   }
}
