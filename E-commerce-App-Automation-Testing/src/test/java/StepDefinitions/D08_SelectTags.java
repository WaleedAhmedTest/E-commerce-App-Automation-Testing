package StepDefinitions;

import Pages.P08_SelectTags;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Locale;

public class D08_SelectTags {

    private final WebDriver driver = Hooks.driver;
    P08_SelectTags selectTagsPage = new P08_SelectTags(driver);

    @Given("user in computers category")
    public void user_in_computers_category() {
        driver.navigate().to(selectTagsPage.selectTagsURL);
    }
    @Then("user clicks on game tag")
    public void user_clicks_on_game_tag() {
        selectTagsPage.clickOnGameTag();
    }
    @Then("user redirects to games tag URL")
    public void user_redirects_to_games_tag_url() {
        String currentURL = driver.getCurrentUrl().toLowerCase(Locale.ROOT);
        String expectedURL = "https://demo.nopcommerce.com/game";
        Assert.assertEquals(currentURL,expectedURL);
    }
    @And("check that title contains game tag")
    public void check_that_title_contains_game_tag(){
        String currentText = selectTagsPage.pageTitle().getText();
        String expectedText = "game";
        Assert.assertTrue(currentText.contains(expectedText));
    }

}
