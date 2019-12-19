package SampleCode.a_aggregation;

/**
 * Demonstrates the Bicycle object.
 */
public class BicycleTest {

	/**
	 * Main Method. This is where the program begins.
	 */
    public static void main(String[] args) {
        Bicycle testBike = new Bicycle();													//Creates a new instance of a Bicycle object

		System.out.println("Front Pressure: " + testBike.getFrontPressure());				//Gets/prints the front tire pressure
		System.out.println("Back Pressure: " + testBike.getBackPressure());  				//Gets/prints the back tire pressure

		testBike.setFrontPressure(45);														//Changes the front tire's pressure
		testBike.setBackPressure(46); 														//Changes the back tire's pressure

		System.out.println("Front Pressure: " + testBike.getFrontPressure());				//Gets/prints the front tire pressure
		System.out.println("Back Pressure: " + testBike.getBackPressure());  				//Gets/prints the back tire pressure

        testBike.speedUp();																	//Increases the bike's speed
		testBike.speedUp();																	//Increases the bike's speed
		System.out.println("Speed: " + testBike.getSpeed());								//Gets/prints the bike's current speed

		testBike.setFrontPressure(5);														//Sets the front tire's pressure to 5
		testBike.speedUp();																	//(Tries to) increase the bike's speed
		System.out.println("Speed: " + testBike.getSpeed());								//Gets/prints the bike's current speed

        testBike.setFrontPressure(7000);													//(Tries to) set the front tire's pressure to 7000. Maxes out at 60.
		System.out.println("Front Pressure: " + testBike.getFrontPressure());				//Gets/prints the front tire pressure
    }

}
