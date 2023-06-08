package pageObjects;

import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.TestContextSetup;

import java.util.concurrent.TimeUnit;

public class ProductPage {

   By productPage= By.xpath("//span[contains(text(),'Products')]");
    By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCart = By.className("shopping_cart_link");
    By cartPage= By.xpath("//span[contains(text(),'Your Cart')]");
    public WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver =driver;
    }

    public Boolean getproductPage()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//seconds 0 so that WebDriver doesn't implicitly wait
        try {
            driver.findElement(productPage);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//seconds back to 30 after the action is complete
        }
    }


    public void addBackpack_toCart()
    {
        driver.findElement(addBackpack).click();
    }

    public void clickShoppinCartLink()
    {
        driver.findElement(shoppingCart).click();
    }

    public Boolean getCartPage()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//seconds 0 so that WebDriver doesn't implicitly wait
        try {
            driver.findElement(cartPage);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//seconds back to 30 after the action is complete
        }
    }

}
