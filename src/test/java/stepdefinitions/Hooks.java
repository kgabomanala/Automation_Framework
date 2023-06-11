package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestContextSetup;

import java.io.File;
import java.io.IOException;

public class Hooks {

    public TestContextSetup testContextSetup;
    public Hooks(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    @After
    public void TearDown(){
        testContextSetup.testBase.driver.quit();
    }
    /*
    @AfterStep
    public  void  addScreenshot(Scenario scenario) throws IOException {

        if(scenario.isFailed()) {
           File sourcePath= ((TakesScreenshot) testContextSetup.testBase.driver).getScreenshotAs(OutputType.FILE);
           byte[] filecontent = FileUtils.readFileToByteArray(sourcePath);
           scenario.attach(filecontent,"image/png","image");
        }
    }

     */
}
