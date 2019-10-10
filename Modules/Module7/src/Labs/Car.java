package Labs;

import java.io.Serializable;

/**
 * Car Object.
 *
 * !!! You do not need to modify this class. !!!
 */
public class Car implements Serializable {

    private int speed;                                                                      //Represents the car's speed
    
    /**
     * Constructor with no arguments.
     */
    public Car() {
        speed = 0;
    }

    /**
     * Accelerates the car by 10
     */
    public void accelerate() {
        speed += 10;
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

}
