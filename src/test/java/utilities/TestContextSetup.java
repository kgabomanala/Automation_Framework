package utilities;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

public class TestContextSetup {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;

    public  TestContextSetup(){
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.SetupBrowser());
    }


}
