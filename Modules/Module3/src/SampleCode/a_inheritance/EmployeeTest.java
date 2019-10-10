package SampleCode.a_inheritance;

/**
 * Demonstrates subclasses of the Employee class.
 */
public class EmployeeTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        HourlyEmployee emp1 = new HourlyEmployee("Bill", 10.50);                    //Creates an instance of an HourlyEmployee object (Employee subclass)

        System.out.println("This employee's name is " + emp1.getName());            //Gets/prints the employee's name (getName inherited from Employee class)
        System.out.println("Their wage is $" + emp1.getWage());                     //Gets/prints the employee's wage (getWage inherited from Employee class)

        
        Supervisor emp2 = new Supervisor("Shirley", 10.50);                         //Creates an instance of a Supervisor object (Employee subclass)

        System.out.println("This supervisor's name is " + emp2.getName());          //Gets/prints the employee's name (getName inherited from Employee class)
        System.out.println("Their wage is $" + emp2.getWage());                     //Gets/prints the employee's wage (overrides getWage from Employee class)
    }

}
