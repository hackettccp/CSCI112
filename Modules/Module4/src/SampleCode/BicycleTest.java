package SampleCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BicycleTest {

    @Test
    public void AccelerateTest() {
        Bicycle b = new Bicycle();
        b.speedUp();                    //Accelerate (add 5) to the speed
        b.speedUp();
        b.speedUp();                    //Speed should be at 15
        assertEquals(15, b.getSpeed());
    }

    @Test
    public void DecelerateTest() {
        Bicycle b = new Bicycle();
        b.speedUp();                    //Accelerate (add 5) to the speed
        b.speedUp();                    //Speed should be at 10
        b.slowDown();                   //Decelerate (subtract 5) from the speed; Speed should be at 5
        assertEquals(5, b.getSpeed());
    }

    @Test
    public void NegativeSpeedTest() {
        Bicycle b = new Bicycle();
        b.speedUp();                    //Accelerate (add 5) to the speed
        b.speedUp();                    //Speed should be at 10
        b.slowDown();                   //Decelerate (subtract 5) from the speed; Speed should be at 5
        b.slowDown();                   //Decelerate (subtract 5) from the speed; Speed should be at 0
        b.slowDown();                   //Decelerate (subtract 5) from the speed; Speed should still be at 0 (not -5)
        assertEquals(0, b.getSpeed());
    }

    @Test
    public void GearTest() {
        Bicycle b = new Bicycle();
        b.setGear(10);                  //Sets the gear to 10
        assertEquals(10, b.getGear());  //Tests the gear field is set to 10
        b.setGear(-5);                  //Sets the gear to -5 (Should be defaulted to 1)
        assertEquals(1, b.getGear());   //Tests the gear field is set to 1
        b.setGear(20);                  //Sets the gear to 20 (Should be defaulted to 1)
        assertEquals(1, b.getGear());   //Tests the gear field is set to 1
    }
}