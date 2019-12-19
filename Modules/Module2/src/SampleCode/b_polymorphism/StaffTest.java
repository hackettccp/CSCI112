package SampleCode.b_polymorphism;

/**
 * Demonstrates the Staff class and polymorphism.
 */
public class StaffTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Staff myStaff = new Staff();                                                                    //Creates a Staff object (using default constructor)

        HourlyEmployee emp1 = new HourlyEmployee("Bill", 10.50);                                        //Creates an HourlyEmployee object (subclass of Employee)
        Supervisor emp2 = new Supervisor("Shirley", 10.50);                                             //Creates a Supervisor object (subclass of Employee)
        HourlyEmployee emp3 = new HourlyEmployee("Joe", 11.00);                                         //Creates an HourlyEmployee object (subclass of Employee)

        myStaff.setEmployee1(emp1);                                                                     //Passes an HourlyEmployee object to Staff's setEmployee1 method (Will be stored as an Employee object)
        myStaff.setEmployee2(emp2);                                                                     //Passes a Supervisor object to Staff's setEmployee2 method (Will be stored as an Employee object)
        myStaff.setEmployee3(emp3);                                                                     //Passes an HourlyEmployee object to Staff's setEmployee3 method (Will be stored as an Employee object)

        System.out.println("Employee 1's name is " + (myStaff.getEmployee(1)).getName());               //Gets/prints employee 1's name (Employee 1 returned as an Employee object)
        System.out.println("Their wage is $" + (myStaff.getEmployee(1)).getWage());                     //Gets/prints employee 1's wage (Employee 1 returned as an Employee object)
        
        System.out.println("Employee 2's name is " + (myStaff.getEmployee(2)).getName());               //Gets/prints employee 2's name (Employee 2 returned as an Employee object)
        System.out.println("Their wage is $" + (myStaff.getEmployee(2)).getWage());                     //Gets/prints employee 2's wage (Employee 2 returned as an Employee object)
        
        System.out.println("Employee 3's name is " + (myStaff.getEmployee(3)).getName());               //Gets/prints employee 3's name (Employee 3 returned as an Employee object)
        System.out.println("Their wage is $" + (myStaff.getEmployee(3)).getWage());                     //Gets/prints employee 3's wage (Employee 3 returned as an Employee object)
    }

}
