import org.testng.annotations.*;


public class TestPreparationBeforeAfterTesting {


    @BeforeClass
    public void classSetup (){

        System.out.println("I am a class setup");

    }

    @AfterClass
    public void classTeardown (){

        System.out.println("I am a class teardown");

    }



    @BeforeTest
    public void setup(){
        System.out.println("I do some BeforeTest");
    }

    @AfterTest
    public void teardown(){
        System.out.println("I do some AfterTest");
    }

    @BeforeGroups("Positive")
    public void smokeSetup(){
        System.out.println("I am smoke test setup BeforeGroups");
    }

    @AfterGroups("Positive")
    public void smokeTeardown(){
        System.out.println("I am smoke test teardown AfterGroups");
    }



}
