import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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