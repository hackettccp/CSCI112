package Lab;

/**
 * Car Object.
 *
 * !!! See CarTest.java !!!
 * !!! For this lab, you will create unit tests for testing this class. !!!
 * !!! You do not need to modify this class. !!!
 */
public class Car {

    private GasTank tank;                                                                   //Represents the car's gas tank
    private int odometer;                                                                   //Represents the car's odometer
    private int speed;                                                                      //Represents the car's speed
    
    /**
     * Constructor with no arguments.
     */
    public Car() {
        tank = new GasTank(15, 15);
        odometer = 0;
        speed = 0;
    }

    /**
     * Retrieves the car's odometer reading.
     */
    public int getOdometer() {
        return odometer;
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
            startFuel -= 5;                                                                   //Subtracts five gallons
            tank.setFuel(startFuel);
            odometer += 100;
        }
    }

    /**
     * Accelerates the car by 10
     * Will not accelerate if the gas tank is empty.
     */
    public void accelerate() {
        if(tank.getFuel() == 0) {
            speed = 0;
        }
        else {
            speed += 10;
        }
    }

    /**
     * Decelerates the car by 10
     * Will not allow the speed to be negative.
     */
    public void brake() {
        speed -= 10;
        if(speed < 0) {                                                                      //Ensure the speed does not go negative
            speed = 0;
        }
    }

    /**
     * Retrieves the car's speed.
     */
    public int getSpeed() {
        return speed;
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
