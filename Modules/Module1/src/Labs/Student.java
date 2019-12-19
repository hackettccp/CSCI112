package Labs;

/**
 * Student Object. DO NOT MODIFY
 */
public class Student {

    private String name;                                                //The student's name
    private double gpa;                                                 //The student's grade point average

    /**
     * Constructor that accepts two arguments, the student's name and GPA
     */
    public Student(String nameIn, double gpaIn) {
        name = nameIn;
        setGPA(gpaIn);
    }

    /**
     * Sets the Student's GPA.
     * Ensures the GPA is in the range 0.0-4.0
     */
    public void setGPA(double gpaIn) {
        if(gpaIn < 0.0) {
            gpa = 0.0;
        }
        else if(gpaIn > 4.0) {
            gpa = 4.0;
        }
        else {
            gpa = gpaIn;
        }
    }

    /**
     * Returns the Student's GPA
     */
    public double getGPA() {
        return gpa;
    }

    /**
     * Sets the Student's name
     */
    public void setName(String nameIn) {
        name = nameIn;
    }

    /**
     * Returns the Student's name
     */
    public String getName() {
        return name;
    }
    
}
