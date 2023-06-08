package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import utilities.TestBase;
import utilities.TestContextSetup;

import static org.testng.AssertJUnit.assertTrue;

public class ProductPage_stepDefinition {

    public  TestContextSetup testContextSetup;

    public ProductPage_stepDefinition(TestContextSetup  testContextSetup) throws InterruptedException {
        Thread.sleep(3000);
        this.testContextSetup = testContextSetup;
    }





    @Given("a user is on the swag labs products page")
    public void a_user_is_on_the_swag_labs_products_page() throws InterruptedException {
        Thread.sleep(1000);
        LoginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();
        Thread.sleep(1000);
        loginPage.enterUsername();
        Thread.sleep(1000);
        loginPage.enterPassword();
        Thread.sleep(1000);
        loginPage.clickLoginButton();
        ProductPage productPage= testContextSetup.pageObjectManager.getProductPage();
        assertTrue(productPage.getproductPage());
    }
    @When("a user add a product to cart")
    public void a_user_add_a_product_to_cart() {
        ProductPage productPage= testContextSetup.pageObjectManager.getProductPage();
        productPage.addBackpack_toCart();
    }
    @Then("user should be on a cart page")
    public void user_should_be_on_a_cart_page() {
        ProductPage productPage= testContextSetup.pageObjectManager.getProductPage();
        productPage.clickShoppinCartLink();
        assertTrue(productPage.getCartPage());
    }
}
