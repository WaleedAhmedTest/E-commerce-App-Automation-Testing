package StepDefinitions;

import Pages.P09_AddToShoppingCart;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Locale;

public class D09_AddToShoppingCart {

    private final WebDriver driver = Hooks.driver;
    P09_AddToShoppingCart addToShoppingCartPage = new P09_AddToShoppingCart(driver);


    @Then("user selects the Apple MacBook pro product")
    public void user_selects_the_apple_mac_book_pro_product() {
        addToShoppingCartPage.clickOnAppleMacBook();
    }
    @Then("adds it to shopping cart")
    public void adds_it_to_shopping_cart() {
        String actualURL = driver.getCurrentUrl().toLowerCase(Locale.ROOT);
        String expectedURL = "https://demo.nopcommerce.com/apple-macbook-pro-13-inch";
        Assert.assertEquals(actualURL,expectedURL);
        addToShoppingCartPage.addAppleMacBookToCart();
    }
    @Then("confirmation message is displayed")
    public void confirmation_message_is_displayed() throws InterruptedException {
        WebElement content = addToShoppingCartPage.content();
        boolean isDisplayed = content.isDisplayed();
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertTrue(isDisplayed);
        Assert.assertEquals(content.getText(),expectedText);
        addToShoppingCartPage.closeNotification();
        Thread.sleep(1000);
    }
    @Then("go to shopping cart")
    public void go_to_shopping_cart() {
        addToShoppingCartPage.goToShoppingCart();
        String actualURL = driver.getCurrentUrl().toLowerCase(Locale.ROOT);
        String expectedURL = "https://demo.nopcommerce.com/cart";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @Then("check that the macBook Pro product is added")
    public void check_that_the_macBook_Pro_product_is_added() {
        boolean productExists;
        String expectedProductName = "Apple MacBook Pro 13-inch";
        // check the existence of the added product
        try {
            productExists = addToShoppingCartPage.MacBookProAsBuyableProduct().getText()
                    .equalsIgnoreCase(expectedProductName);
        }
        catch (Exception e){
            productExists = false;
        }
        Assert.assertTrue(productExists);
    }

}
