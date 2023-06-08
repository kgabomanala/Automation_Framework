package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import utilities.TestBase;
import utilities.TestContextSetup;

import static org.testng.AssertJUnit.assertTrue;

public class LoginPage_stepDefinition {
     public TestContextSetup testContextSetup;
    public LoginPage_stepDefinition(TestContextSetup  testContextSetup){
        this.testContextSetup = testContextSetup;

    }


    @Given("a user is on the swag labs login page")
    public void a_user_is_on_the_swag_labs_login_page() {
        System.out.println("kgabo");
    }
    @When("a user enters username and password")
    public void a_user_enters_username_and_password() {
        LoginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLoginButton();
    }
    @Then("user has successfully logged in")
    public void user_has_successfully_logged_in() {

        ProductPage productPage= testContextSetup.pageObjectManager.getProductPage();
        assertTrue(productPage.getproductPage());
    }
}
