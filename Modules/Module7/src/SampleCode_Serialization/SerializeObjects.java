package SampleCode_Serialization;
import java.util.Scanner;
import java.io.*;

/**
 * This program serializes the objects in an array of InventoryItem objects.
 */
public class SerializeObjects {

   /**
    * Main Method. This is where the program begins.
    */
   public static void main(String[] args) {
      String description;                                                                                         //Item description
      int units;                                                                                                  //Units on hand

      Scanner keyboard = new Scanner(System.in);                                                                  //Create a Scanner object for keyboard input.

      InventoryItem[] items = new InventoryItem[3];                                                               //Create an array to hold InventoryItem objects.

      System.out.println("Enter data for 3 inventory items.");                                                    //Get data for the InventoryItem objects.
                         
      for(int i = 0; i < items.length; i++) {
         System.out.print("Enter an item description: ");                                                         //Get the item description.
         description = keyboard.nextLine();

         System.out.print("Enter the number of units: ");                                                         //Get the number of units.
         units = Integer.parseInt(keyboard.nextLine());

         items[i] = new InventoryItem(description, units);                                                        //Instantiate an InventoryItem object in the array.
      }
      
      FileOutputStream outStream = null;                                                                          //Variables for the stream objects.
      ObjectOutputStream objectOutputFile = null;

      try {
         outStream = new FileOutputStream("src\\SampleCode_Serialization\\InventoryItemObjects.dat");
         objectOutputFile = new ObjectOutputStream(outStream);                                                    //Instantiates the output stream object.

         for (int i = 0; i < items.length; i++) {
            objectOutputFile.writeObject(items[i]);                                                               //Serializes each object from the array to the file.
         }
      }
      catch(IOException e) {
         System.out.println("Problem writing to file.");
      }
      finally {
         try {
            objectOutputFile.close();
         }
         catch(IOException e) {
            //Output stream was never opened;Do nothing
         }
      }

      System.out.println("The serialized objects were written to the InventoryItemObjects.dat file.");            //Close the file.
   }
}
