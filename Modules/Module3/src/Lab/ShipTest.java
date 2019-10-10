package Lab;

/**
 * This class will compile and run once you correctly complete the
 * CruiseShip and CargoShip classes.
 * 
 * Aside from uncommenting lines 20-25, DO NOT MODIFY THIS CLASS.
 *
 * How the output should look:
 * Name: RMS Queen Mary, Year Built: 1934, Passengers: 2139
 * Name: USS Reluctant, Year Built: 1955, Capacity: 705
 */
public class ShipTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
       /*
        CruiseShip ship1 = new CruiseShip(2139, "RMS Queen Mary", "1934");
        CargoShip ship2 = new CargoShip(705, "USS Reluctant", "1955");
        
        shipMethod(ship1);
        System.out.println();
        shipMethod(ship2);
       */
    }
    
    /**
     * Implicitly calls and prints the String returned from a Ship 
     * argument's toString method.
     */
    public static void shipMethod(Ship shipIn) {
        System.out.println(shipIn);
    }
    
}
