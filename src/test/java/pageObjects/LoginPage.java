package pageObjects;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.TestContextSetup;

public class LoginPage {

    public  WebDriver driver;
    By login = By.id("login-button");
    By username = By.id("user-name");
    By password = By.id("password");


    public LoginPage(WebDriver driver){
        this.driver =driver;
    }

    public void clickLoginButton()
    {
        driver.findElement(login).click();
    }


    public void enterUsername()
    {
        driver.findElement(username).sendKeys("standard_user");
    }

    public void enterPassword()
    {
        driver.findElement(password).sendKeys("secret_sauce");
    }


}
