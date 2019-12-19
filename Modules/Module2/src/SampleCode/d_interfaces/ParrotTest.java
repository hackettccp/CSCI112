package SampleCode.d_interfaces;

/**
 * Demonstrates using the Parrot object.
 */
public class ParrotTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        TalkingBird bird1;                                                  //Declares a variable of the interface type TalkingBird
        //bird1 = new TalkingBird("Green");                                 //Can't instantiate an interface type
        bird1 = new Parrot("Red");                                          //Can reference an object that implements the interface

        birdTest((Bird)bird1);                                              //Object is typecast to a Bird object
        birdTest((Parrot)bird1);                                            //Object is typecast to a Parrot object (OK since it is a subclass)
        talkingBirdTest(bird1);                                             //No typecasting needed
        parrotTest((Parrot)bird1);                                          //Object is typecast to a Parrot object
        
        Parrot bird2 = new Parrot("Green");                                 //Instantiates a Parrot object.

        birdTest(bird2);                                                    //Parrot object can be passed as a Bird argument (since it is a subclass)
        talkingBirdTest(bird2);                                             //Parrot object can be passed as a TalkingBird argument (since it implements TalkingBird)
        parrotTest(bird2);                                                  //Parrot object can (obviously) be passed as a Parrot argument
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
        //birdIn.sayHello();                                                //Doesn't work; Bird object does not have, nor requires the sayHello method
        System.out.println();
    }

    /**
     * Accepts a TalkingBird argument (or an object that implements TalkingBird)
     * (Can only call methods that appear in the TalkingBird interface)
     * (If an implementing class has extra methods, they cannot be used)
     */
    private static void talkingBirdTest(TalkingBird talkingBirdIn) {
        System.out.println("Talking Bird Test Method");
        //System.out.println("Color: " + talkingBirdIn.getColor());         //Doesn't work; TalkingBird doesn't require a getColor method
        //talkingBirdIn.birdCall();                                         //Doesn't work; TalkingBird doesn't require a birdCall method
        talkingBirdIn.sayHello();
        System.out.println();
    }

    /**
     * Accepts a Parrot argument
     */
    private static void parrotTest(Parrot parrotIn) {
        System.out.println("Parrot Test Method");
        System.out.println("Color: " + parrotIn.getColor());
        parrotIn.birdCall();
        parrotIn.sayHello();
        System.out.println();
    }

}
