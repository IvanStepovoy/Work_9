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


    //Test constructor: model Not Equals
    @Test
    public void testConstrModelNotEquals() {

        BMW7 testBMW = new BMW7("BMW 745", 250,
                333, 450);

        assertNotEquals(testBMW.getModel(), "BMW 745i" );

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
    //Failure of the test
    @Test
    public void FailureOfTheTest() {

        BMW7 testBMW = new BMW7("BMW 745i", 250,
                333, 450);

        int result = testBMW.getMaxSpeed() ;
        assertEquals(result,250);
        System.out.println("Failure of the test");

        if (result !=251){
            fail("Not exactly 250");
        }

    }


    //NEGATIVE TESTS

    //Test negative spec simbol constructor: model
    @Test(groups = "Negative")
    public void testConstrModel1() {

        BMW7 testBMW = new BMW7("!@#$%^&*()_{}[]<>", 250,
                333, 450);

        assertEquals(testBMW.getModel(), "!@#$%^&*()_{}[]<>" );

    }

    //Test negative empty space constructor: model
    @Test(groups = "Negative")
    public void testConstrModel2() {

        BMW7 testBMW = new BMW7("", 250,
                333, 450);

        assertEquals(testBMW.getModel(), "" );

    }

    //Test negative whiteSpace constructor: model
    @Test(groups = "Negative")
    public void testConstrModel3() {

        BMW7 testBMW = new BMW7(" ", 250,
                333, 450);

        assertEquals(testBMW.getModel(), " " );

    }

    //Test negative spaces at the beginning, middle, end constructor: model
    @Test(groups = "Negative")
    public void testConstrModel4() {

        BMW7 testBMW = new BMW7(" v B ", 250,
                333, 450);

        assertEquals(testBMW.getModel(), " v B " );

    }

    //Test negative numbers vs symbols constructor: model
    @Test(groups = "Negative")
    public void testConstrModel5() {

        BMW7 testBMW = new BMW7("234bnm2m5h3g", 250,
                333, 450);

        assertEquals(testBMW.getModel(), "234bnm2m5h3g" );

    }




}