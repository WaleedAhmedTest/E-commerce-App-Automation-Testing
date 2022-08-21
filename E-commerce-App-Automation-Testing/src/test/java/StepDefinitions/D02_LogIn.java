package StepDefinitions;

import Pages.P02_Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class D02_LogIn {

    private final WebDriver driver = Hooks.driver;
    P02_Login loginPage = new P02_Login(driver);


    @Given("user in log in page")
    public void user_in_log_in_page() {
        driver.navigate().to(loginPage.loginURL);
    }
    @Then("user fills email field")
    public void user_fills_email_field() {
        loginPage.FillEmailField(Utils.EMAIL);
    }
    @And("user fills password field")
    public void user_fills_password_field() {
        loginPage.FillPasswordField(Utils.PASSWORD);
    }
    @Then("press on the log in button")
    public void press_on_the_log_in_button() {
        loginPage.clickLogInButton();
    }
}
