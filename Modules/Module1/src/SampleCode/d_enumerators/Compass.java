package SampleCode.d_enumerators;

/**
 * Demonstrates use of an enumerator.
 */
public class Compass {
    
    enum Directions {NORTH, SOUTH, EAST, WEST}                                                          //Enumerator for four directions.

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Directions myDirection = Directions.NORTH;                                                      //Assigns a Direction object
        
        String directionString = myDirection.toString();                                                //Gets and prints the String value of the Direction
        System.out.println(directionString);
        
        int positionNumber = myDirection.ordinal();                                                     //Gets and prints the ordinal value of the Direction
        System.out.println(positionNumber);

        
        if(myDirection.compareTo(Directions.EAST) < 0) {                                                //Compares two Directions
            System.out.println(directionString + " comes before EAST");
        }

        Directions otherDirection = Directions.WEST;                                                    //Assigns a second Direction object

        if(myDirection.compareTo(otherDirection) < 0) {                                                 //Compares two Directions
            System.out.println(directionString + " comes before " + otherDirection.toString());
        }

        
        if(otherDirection.compareTo(myDirection) == 0) {                                                //Compares equality of two Directions
            System.out.println("The directions are equal");
        }

        if(myDirection.equals(otherDirection)) {                                                        //Compares equality (equals method) of two Directions
            System.out.println("The directions are equal");
        }
    }
    
}
