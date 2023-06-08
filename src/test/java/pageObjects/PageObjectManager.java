package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;
    LoginPage loginPage;
    ProductPage productPage;
   public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public  LoginPage  getLoginPage(){
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public  ProductPage  getProductPage(){
        productPage = new ProductPage(driver);
        return productPage;
    }
}
