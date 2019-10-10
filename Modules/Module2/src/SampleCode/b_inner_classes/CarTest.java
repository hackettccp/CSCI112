package SampleCode.b_inner_classes;

/**
 * Demonstrates the car object.
 */
public class CarTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Car testCar = new Car();                                            //Creates an instance of a Car object
        System.out.println(testCar + "\n");                                 //Prints the object's state

        testCar.drive();                                                    //Advances the car 100 miles.
        System.out.println(testCar);                                 //Prints the object's state
        testCar.drive();                                                    //Advances the car 100 miles.
        System.out.println(testCar);                                 //Prints the object's state
        testCar.drive();                                                    //Advances the car 100 miles.
        System.out.println(testCar + "\n");                                 //Prints the object's state

        testCar.drive();                                                    //(Tries to) advance the car 100 miles.
        System.out.println(testCar + "\n");                                 //Prints the object's state

        testCar.setFuel(200);                                               //Adds 200 gallons of fuel (maxes out at capacity: 15 gallons)
        System.out.println(testCar);                                        //Prints the object's state
    }
    
}
