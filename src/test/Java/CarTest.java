import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.InvalidParameterException;

import static org.testng.Assert.*;

public class CarTest extends TestPreparationBeforeAfterTesting {




//Test Setter

    @Test(groups = "Setter")
    public void testSetBrandMethod() {

        Car testCar = new Car();
        testCar.setBrand("BMW");
        assertEquals(testCar.getBrand(), "BMW");
    }

    @Test(groups = "Setter")
    public void testSetModelMethod() {

        Car testCar = new Car();
        testCar.setModel("745i");
        assertEquals(testCar.getModel(), "745i");
    }

    @Test(groups = "Setter")
    public void testSetMaxSpeedMethod() {

        Car testCar = new Car();
        testCar.setMaxSpeed(255);
        assertEquals(testCar.getMaxSpeed(), 255);
    }

    @Test(groups = "Setter")
    public void testSetHorsePowerMethod() {

        Car testCar = new Car();
        testCar.setHorsePower(500);
        assertEquals(testCar.getHorsePower(), 500);
    }

    @Test(groups = "Setter")
    public void testSetTorqueMethod() {

        Car testCar = new Car();
        testCar.setTorque(750);
        assertEquals(testCar.getTorque(), 750);
    }



    //
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divideByZero() {

        Car testCar = new Car();
        testCar.setBrand("BMW");


        throw new InvalidParameterException("second number shouldn't be '0'");

    }

    //NEGATIVW TESTS SETTER

    //Test negative spec simbol Setter: model
    @Test(groups = "Negative")
    public void testSetBrandMethod1() {

        Car testCar = new Car();
        testCar.setBrand("!@#$%^&*()_{}[]<>");
        assertEquals(testCar.getBrand(), "!@#$%^&*()_{}[]<>");
    }

    //Test negative empty space Setter: model
    @Test(groups = "Negative")
    public void testSetBrandMethod2() {

        Car testCar = new Car();
        testCar.setBrand("");
        assertEquals(testCar.getBrand(), "");
    }

    //Test negative whiteSpace Setter: model
    @Test(groups = "Negative")
    public void testSetBrandMethod3() {

        Car testCar = new Car();
        testCar.setBrand(" ");
        assertEquals(testCar.getBrand(), " ");
    }

    //Test negative spaces at the beginning, middle, end Setter: model
    @Test(groups = "Negative")
    public void testSetBrandMethod4() {

        Car testCar = new Car();
        testCar.setBrand(" v B ");
        assertEquals(testCar.getBrand(), " v B ");
    }

    //Test negative numbers vs symbols Setter: model
    @Test(groups = "Negative")
    public void testSetBrandMethod5() {

        Car testCar = new Car();
        testCar.setBrand("234bnm2m5h3g");
        assertEquals(testCar.getBrand(), "234bnm2m5h3g");
    }






/*
//Test Getter


    @Test (groups = "Getter")
    public void testGetBrandMethod() {


    }

    @Test(groups = "Getter")
    public void testGetMaxSpeedMethod() {


    }

    @Test(groups = "Getter")
    public void testGetHorsePowerMethod() {
    }

    @Test(groups = "Getter")
    public void testGetTorqueMethod() {
    }

*/


}