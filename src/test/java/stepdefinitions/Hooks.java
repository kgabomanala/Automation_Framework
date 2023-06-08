package stepdefinitions;

import io.cucumber.java.After;
import utilities.TestContextSetup;

public class Hooks {

    public TestContextSetup testContextSetup;
    public Hooks(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    @After
    public void TearDown(){
        testContextSetup.testBase.driver.quit();
    }
}
