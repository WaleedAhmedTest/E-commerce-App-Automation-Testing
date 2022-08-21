package StepDefinitions;

import Pages.P11_AddToCompareList;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Locale;

public class D11_AddToCompareList {

    private final WebDriver driver = Hooks.driver;
    P11_AddToCompareList addToCompareListPage = new P11_AddToCompareList(driver);

    @Then("user adds HTCOne phone directly")
    public void user_adds_htc_one_phone_directly() {
        addToCompareListPage.addHTCOneToCompareListDirectly();
    }
    @Then("adds it to compare list")
    public void adds_it_to_compare_list() {
        addToCompareListPage.addAppleMacBookToCompareList();
    }
    @Then("confirm compare list message is displayed")
    public void confirm_compare_list_message_is_displayed() {
        WebElement content = addToCompareListPage.content();
        boolean isDisplayed = content.isDisplayed();
        String expectedText = "The product has been added to your product comparison";
        Assert.assertTrue(isDisplayed);
        Assert.assertEquals(content.getText(),expectedText);
    }
    @Then("go to compare list")
    public void go_to_compare_list() {
        addToCompareListPage.goToCompareList();
        String actualURL = driver.getCurrentUrl().toLowerCase(Locale.ROOT);
        String expectedURL = "https://demo.nopcommerce.com/compareproducts";
        Assert.assertEquals(actualURL,expectedURL);
    }
    @Then("check that the HTCOne product is added")
    public void check_that_the_htc_one_product_is_added() {
        boolean productExists;
        String expectedProductName = "HTC One M8 Android L 5.0 Lollipop";
        // check the existence of the added product
        try {
            productExists = addToCompareListPage.HTCOneAsBuyableProduct().getText()
                    .equalsIgnoreCase(expectedProductName);
        }
        catch (Exception e){
            productExists = false;
        }
        Assert.assertTrue(productExists);
    }
}
