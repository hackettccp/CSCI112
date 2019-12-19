package SampleCode_Serialization;
import java.io.Serializable;

/**
 * A class representing some item in a store.
 * Has a description/name and a number of units in stock.
 *
 * Implements the Serializable interface.
 */
public class InventoryItem implements Serializable {

   public String description;
   public int units;

   public InventoryItem(String d, int u) {
      description = d;
      units = u;
   }

}
