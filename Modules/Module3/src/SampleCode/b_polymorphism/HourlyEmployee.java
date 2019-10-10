package SampleCode.b_polymorphism;

/**
 * HourlyEmployee class.
 *
 * A subclass of Employee.
 * Inherits the getName and getWage methods from Employee.
 */
public class HourlyEmployee extends Employee {

    /**
     * Constructor that accepts two arguments.
     */
    public HourlyEmployee(String nameIn, double wageIn) {
        super(nameIn, wageIn);
    }

}
