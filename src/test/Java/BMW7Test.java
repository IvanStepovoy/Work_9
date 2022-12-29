import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BMW7Test {




    //Test constructor: model
    @Test
    public void testConstrModel() {

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        assertEquals(testBMW.getModel(), "BMW 745i" );

    }

    //Test constructor: maxSpeed
    @Test
    public void testConstrMaxSpeed() {

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        assertEquals(testBMW.getMaxSpeed(), 250 );

    }

    //Test constructor: Horse Power
    @Test
    public void testConstrHorsePower() {

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        assertEquals(testBMW.getHorsePower(), 333 );

    }

    //Test constructor: Torque
    @Test
    public void testConstrTorque() {

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        assertEquals(testBMW.getTorque(), 450 );

    }



}