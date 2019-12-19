package SampleCode.b_polymorphism;

/**
 * The Staff class aggregates three Employee objects.
 */
public class Staff {

    private Employee employee1;                                     //The first employee
    private Employee employee2;                                     //The second employee
    private Employee employee3;                                     //The third employee

    /**
     * Sets the first employee.
     * (Will also accept any subclass of an Employee as an argument)
     */
    public void setEmployee1(Employee e) {
        employee1 = e;
    }

    /**
     * Sets the second employee.
     * (Will also accept any subclass of an Employee as an argument)
     */
    public void setEmployee2(Employee e) {
        employee2 = e;
    }

    /**
     * Sets the third employee.
     * (Will also accept any subclass of an Employee as an argument)
     */
    public void setEmployee3(Employee e) {
        employee3 = e;
    }
    
    /**
     * Returns one of the three Employee objects.
     * (Even though the return type is an Employee object, the method
     *  can still return subclasses of Employee)
     */
    public Employee getEmployee(int idNum) {
        if(idNum == 1) {
            return employee1;
        }
        else if (idNum == 2) {
            return employee2;
        }
        else if (idNum == 3) {
            return employee3;
        }
        else {
            return null;
        }
    }

}
