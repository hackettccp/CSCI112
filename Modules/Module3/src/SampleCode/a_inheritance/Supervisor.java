package SampleCode.a_inheritance;

/**
 * Supervisor class.
 * 
 * A subclass of Employee.
 * Inherits the getName method.
 * Overrides the getWage method inherited from Employee.
 */
public class Supervisor extends Employee {

    /**
     * Constructor that accepts two arguments
     */
    public Supervisor(String nameIn, double wageIn) {
        super(nameIn, wageIn);
    }

    /**
     * Overrides the Employee class getWage method.
     * If this class needs to use the Employee class getWage method,
     * it needs to call super.getWage().
     */
    public double getWage() {
        return super.getWage() * 1.3;
    }

}
