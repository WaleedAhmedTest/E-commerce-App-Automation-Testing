package StepDefinitions;

import Pages.P07_FilterByColor;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D07_FilterByColor {
    private final WebDriver driver = Hooks.driver;
    P07_FilterByColor filterByColorPage = new P07_FilterByColor(driver);

    @Then("user goes to shoes under apparel")
    public void user_goes_to_shoes_under_apparel() {
        filterByColorPage.chooseShoesSubcategoryUnderApparel();
    }
    @Then("check if grey shoes is displayed")
    public void check_if_grey_shoes_is_displayed() {
        boolean greyDisplayed = filterByColorPage.NikeFloralRoshe().isDisplayed();
        Assert.assertTrue(greyDisplayed);
    }
    @Then("check if red shoes is displayed")
    public void check_if_red_shoes_is_displayed() {
        boolean redDisplayed = filterByColorPage.AdidasConsortium().isDisplayed();
        Assert.assertTrue(redDisplayed);
    }
    @Then("filter by red color")
    public void filter_by_red_color() {
        filterByColorPage.clickRedColorCheckBox();
    }

    @Then("check if grey shoes is not displayed")
    public void check_if_grey_shoes_is_not_displayed() {
        /*
        selenium will try to click on the grey shoes
        if it fails (as the shoes is no longer displayed due to the filter by red)
        then the shoes is not displayed so we assertTrue the boolean element
        */
        boolean greyDisplayed = true;
        try {
            filterByColorPage.NikeFloralRoshe().click();
        }
        catch (Exception e){
            greyDisplayed = false;
        }
        Assert.assertFalse(greyDisplayed);
    }
}
