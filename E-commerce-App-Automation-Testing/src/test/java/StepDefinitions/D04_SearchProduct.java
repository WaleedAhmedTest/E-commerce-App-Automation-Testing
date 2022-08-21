package StepDefinitions;

import Pages.P03_ResetPassword;
import Pages.P04_SearchProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D04_SearchProduct {

    private final WebDriver driver = Hooks.driver;
    P04_SearchProduct searchProductPage = new P04_SearchProduct(driver);

    @Given("user in home page")
    public void user_in_home_page() {
        driver.navigate().to(Utils.HOME_PATH_URL);
    }
    @Then("user searches for an item")
    public void user_searches_for_an_item() {
        searchProductPage.FillSearchField(Utils.SEARCHABLE_ITEM);
    }
    @Then("press on search button")
    public void press_on_search_button() {
        searchProductPage.clickSearchButton();
    }
    @Then("selects the product")
    public void selects_the_product(){
        searchProductPage.LenovoIdeaProduct.click();
    }

}
