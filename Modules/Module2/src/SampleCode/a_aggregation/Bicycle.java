package SampleCode.a_aggregation;

/**
 * Bicycle Object.
 */
public class Bicycle {

    private Tire frontTire;                                                         //Represents the Bicycle's front tire
    private Tire backTire;                                                          //Represents the Bicycle's back tire
    private int speed;                                                              //Represents the Bicycle's speed

    /**
     * Constructor.
     */
    public Bicycle() {
        frontTire= new Tire(40, 15);
	backTire= new Tire(42, 15);
        speed = 0;
    }

    /**
     * Retrieves the pressure field from the frontTire field.
     */
    public int getFrontPressure() {
        return frontTire.getPressure();
    }

    /**
     * Retrieves the pressure field from the backTire field.
     */
    public int getBackPressure() {
        return backTire.getPressure();
    }

    /**
     * Changes the pressure field of the frontTire field.
     */
    public void setFrontPressure(int p) {
        frontTire.setPressure(p);
    }

    /**
     * Changes the pressure field of the backTire field.
     */
    public void setBackPressure(int p) {
        backTire.setPressure(p);
    }

    /**
     * Increases the speed field.
     * If either tire is below 10 (too flat), the speed is set to zero.
     */
    public void speedUp() {
        if(frontTire.getPressure() <= 10 || backTire.getPressure() <= 10) { 
            speed = 0;
	    }
	    else {
            speed += 5;
	    }
    }
    
    /**
     * Retrieves the speed field.
     */
    public int getSpeed() {
        return speed;
    }


}
