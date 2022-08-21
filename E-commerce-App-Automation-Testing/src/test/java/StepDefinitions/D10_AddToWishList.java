package StepDefinitions;

import Pages.P10_AddToWishList;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Locale;

public class D10_AddToWishList {

    private final WebDriver driver = Hooks.driver;
    P10_AddToWishList addToWishListPage = new P10_AddToWishList(driver);

    @Then("adds it to wishlist")
    public void adds_it_to_wishlist() {
        addToWishListPage.addAppleMacBookToWishList();
    }
    @Then("confirm wishlist message is displayed")
    public void confirm_wishlist_message_is_displayed() throws InterruptedException {
        WebElement content = addToWishListPage.content();
        boolean isDisplayed = content.isDisplayed();
        String expectedText = "The product has been added to your wishlist";
        Assert.assertTrue(isDisplayed);
        Assert.assertEquals(content.getText(),expectedText);
        addToWishListPage.closeNotification();
        Thread.sleep(1000);
    }
    @Then("go to wishlist")
    public void go_to_wishlist() {
        addToWishListPage.goToWishList();
        String actualURL = driver.getCurrentUrl().toLowerCase(Locale.ROOT);
        String expectedURL = "https://demo.nopcommerce.com/wishlist";
        Assert.assertEquals(actualURL,expectedURL);
    }
}
