package SampleCode.c_abstract_classes;

/**
 * Demonstrates using a subclass.
 */
public class BirdTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        Bird bird1;                                                     //OK to declare a variable of an abstract type.
        //bird1 = new Bird("Brown");                                    //Can't instantiate an abstract type
        
        bird1 = new Owl("Brown");                                       //Instantiates an Owl object. Variable bird1 is a Bird object.

        birdTest(bird1);                                                //birdTest accepts a Bird object argument
        //owlTest(bird1);                                               //Cannot pass bird1 to owlTest because it accepts an Owl object argument (Bird is not a subclass of Owl)
        owlTest((Owl)bird1);                                            //Typecasts bird1 to its actual object type (this wasn't shown in the slides)

        Owl bird2 = new Owl("White");                                   //Instantiates an Owl object with Owl variable-type.
        birdTest(bird2);                                                //Owl is a subclass of Bird, so birdTest will accept it as an argument.
        owlTest(bird2);                                                 //owlTest accepts an Owl argument
    }

    /**
     * Accepts a Bird argument (or subclass of Bird)
     * (Can only call methods that appear in the Bird class)
     * (If a subclass has extra methods, they cannot be used)
     */
    private static void birdTest(Bird birdIn) {
        System.out.println("Bird Test Method");
        System.out.println("Color: " + birdIn.getColor());
        birdIn.birdCall();
        System.out.println();
    }

    /**
     * Only accepts an Owl argument
     */
    private static void owlTest(Owl owlIn) {
        System.out.println("Owl Test Method");
        System.out.println("Color: " + owlIn.getColor());
        owlIn.birdCall();
        System.out.println();
    }

}
