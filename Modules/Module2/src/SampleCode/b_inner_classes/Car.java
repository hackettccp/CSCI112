package SampleCode.b_inner_classes;

/**
 * Car Object.
 */
public class Car {

    private GasTank tank;                                                                   //Represents the car's gas tank
    private int odometer;                                                                   //Represents the car's odometer
    
    /**
     * Constructor with no arguments.
     */
    public Car() {
        tank = new GasTank(15, 15);
        odometer = 0;
    }
    
    /**
     * Retrieves the car's fuel level.
     */
    public int getFuel() {
        return tank.getFuel();
    }
    
    /**
     * Changes the car's fuel level.
     */
    public void setFuel(int f) {
        tank.setFuel(f);
    }
    
    /**
     * Drives the car 100 miles.
     */
    public void drive() {
        int startFuel = tank.getFuel();
        if(startFuel > 0) {
            startFuel -= 5; //Subtracts five gallons
            tank.setFuel(startFuel);
            odometer += 100;
        }
    }
    
    /**
     * String representation.
     */
    public String toString() {
        return "Gallons remaining: " + tank.getFuel() + ", Miles: " + odometer;
    }
    
    /**
     * Inner Class.
     * Only able to be used inside the Car object (because it is private)
     */  
    private class GasTank {
        private final int CAPACITY;                                                         //Represents the Gas Tank's capacity
	    private int fuel;                                                                   //Represents the current amount of fuel

        /**
         * Constructor that accepts two arguments, teh gas tank's capacity and the amount of fuel.
         */
	    public GasTank(int c, int f) {
            CAPACITY = c;
            setFuel(f);
	    }
        
        /**
         * Changes the fuel field.
         * Ensures the fuel neither exceeds the capacity nor goes negative.
         */
        public void setFuel(int f) {
            if(f >= 0 && f <= CAPACITY) {
                fuel = f;
            }
            else if(f > CAPACITY) {
                fuel = CAPACITY;
            }
            else {
                fuel = 0;
            }
        }
        
        /**
         * Retrieves the fuel field.
         */
        public int getFuel() {
            return fuel;
        }
        
    }

}
