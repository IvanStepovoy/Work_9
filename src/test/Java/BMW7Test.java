import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BMW7Test extends TestPreparationBeforeAfterTesting {




    //Test constructor: model
    @Test(groups = "Positive", timeOut = 5000)
    public void testConstrModel() {

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        assertEquals(testBMW.getModel(), "BMW 745i" );

    }


    // //Test boolean constructor: model
    @Test
    public void stringTestBool(){

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        String expected = "BMW 745i";
        String result = testBMW.getModel() ;

        assertTrue(result.equalsIgnoreCase(expected), String.format("Actual: \"%s\", Expected: \"%s\" " ,result,expected));

    }



    //Test constructor: maxSpeed
    @Test(groups = "Positive", timeOut = 5000)
    public void testConstrMaxSpeed() {

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        assertEquals(testBMW.getMaxSpeed(), 250 );

    }

    //Test constructor: Horse Power
    @Test(groups = "Positive", timeOut = 5000)
    public void testConstrHorsePower() {

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        assertEquals(testBMW.getHorsePower(), 333 );

    }

    //Test constructor: Torque
    @Test(groups = "Positive", timeOut = 5000)
    public void testConstrTorque() {

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        assertEquals(testBMW.getTorque(), 450 );

    }


    //Test Param Method InstantOf BMW7 Class
    @Test
    public void testParamMethodInstantOfBMW7Class(){

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        assertTrue (testBMW instanceof BMW7);

    }






    //Test Param Method InstantOf BMW7 Class enabled = false
    @Test(enabled = false)
    public void test1ParamMethodInstantOfBMW7Class(){

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        assertTrue (testBMW instanceof BMW7);

    }







}