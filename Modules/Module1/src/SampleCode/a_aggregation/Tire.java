package SampleCode.a_aggregation;

/**
 * Tire Object.
 */
public class Tire {

    private int pressure;                                           //The tire's pressure
    private int radius;                                             //The tire's radius

    /**
     * Constructor that accepts two arguments for setting the two fields.
     */
    public Tire(int pressureIn, int radiusIn) {
        setPressure(pressureIn);
        setRadius(radiusIn);
    }

    /**
     * Changes the pressure field.
     * Ensures the pressure is between 0 and 60.
     */
    public void setPressure(int p) {
        if(p >= 0 && p <= 60) { 
            pressure = p;
	    }
	    else {
            pressure = 0;
	    }
    }
    
    /**
     * Changes the radius field.
     * Ensures the radius is between 20 and 30.
     */
    public void setRadius(int r) {
        if(r >= 20 && r <= 30) {
            radius = r;
        }
        else {
            radius = 20;
        }
    }
    
    /**
     * Retrieves the pressure field.
     */
    public int getPressure() {
        return pressure;
    }
    
    /**
     * Retrieves the radius field.
     */
    public int getRadius() {
        return radius;
    }

}

