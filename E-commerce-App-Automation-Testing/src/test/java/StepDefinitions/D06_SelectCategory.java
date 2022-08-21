package StepDefinitions;

import Pages.P06_SelectCategory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Locale;

public class D06_SelectCategory {

    private final WebDriver driver = Hooks.driver;
    P06_SelectCategory selectCategoryPage = new P06_SelectCategory(driver);

    @Then("user selects Books category")
    public void user_selects_books_category() {
        selectCategoryPage.chooseBooksCategory();
        String currentURL = driver.getCurrentUrl().toLowerCase(Locale.ROOT);
        String expectedURL = "https://demo.nopcommerce.com/books";
        Assert.assertEquals(currentURL,expectedURL);
    }

    @Then("user selects Cellphones subcategory under electronics")
    public void user_selects_cellphones_subcategory_under_electronics() {
        selectCategoryPage.chooseCellPhonesSubcategoryUnderElectronics();
        String currentURL = driver.getCurrentUrl().toLowerCase(Locale.ROOT);
        String expectedURL = "https://demo.nopcommerce.com/cell-phones";
        Assert.assertEquals(currentURL,expectedURL);
    }

}
