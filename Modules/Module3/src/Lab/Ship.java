package Lab;

/**
 * Abstract Ship Object.
 * 
 * DO NOT MODIFY THIS CLASS.
 * 
 */
public abstract class Ship {

    private String name;                                                        //The ship's name
    private String yearBuilt;                                                   //The year the ship was built
    
    /**
     * Constructor that accepts two arguments
     */
    public Ship(String nameIn, String yearBuiltIn) {
        name = nameIn;
        yearBuilt = yearBuiltIn;
    }
    
    /**
     * Retrieves the name field.
     */
    public final String getName() {
        return name;
    }
    
    /**
     * Changes the name field.
     */
    public final void setName(String nameIn) {
        name = nameIn;
    }
    
    /**
     * Retrieves the yearBuilt field.
     */
    public final String getYearBuilt() {
        return yearBuilt;
    }
    
    /**
     * Changes the yearBuilt field.
     */
    public final void setYearBuilt(String yearBuiltIn) {
        yearBuilt = yearBuiltIn;
    }
    
    /**
     * Abstract toString method.
     */
    public abstract String toString();
}
