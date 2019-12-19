package SampleCode.b_polymorphism;

/**
 * Employee class.
 */
public class Employee {

    private String name;                                                //Represents the employee's name
    private double wage;                                                //Represents the employee's wage

    /**
     * Constructor that accepts two arguments.
     */
    public Employee(String nameIn, double wageIn) {
        name = nameIn;
        wage = wageIn;
    }

    /**
     * Returns the Employee's wage.
     */
    public double getWage() {
        return wage;
    }

    /**
     * Returns the Employee's name.
     */
    public final String getName() {
        return name;
    }

}
