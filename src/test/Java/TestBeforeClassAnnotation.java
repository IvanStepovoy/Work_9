import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;



public class TestBeforeClassAnnotation {


    @BeforeClass
    public void classSetup (){

        System.out.println("I am a class setup");

    }


    @AfterClass
    public void classTeardown (){

        System.out.println("I am a class teardown");

    }



}
