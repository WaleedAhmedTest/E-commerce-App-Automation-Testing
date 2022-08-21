package StepDefinitions;

import Pages.P03_ResetPassword;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D03_ResetPassword {

    private final WebDriver driver = Hooks.driver;
    P03_ResetPassword resetPasswordPage = new P03_ResetPassword(driver);

    @Given("user in reset password page")
    public void user_in_reset_password_page() {
        driver.navigate().to(resetPasswordPage.ResetPasswordURL);
    }
    @Then("user enters a valid email")
    public void user_enters_a_valid_email() {
        resetPasswordPage.FillEmailField(Utils.EMAIL);
    }
    @Then("press the recovery button")
    public void press_the_recovery_button() {
        resetPasswordPage.clickRecoveryButton();
    }
    @Then("confirm that the recovery message is displayed")
    public void confirm_that_the_recovery_message_is_displayed() {
        WebElement recoveryMessage = resetPasswordPage.isRecoveryMessageDisplayed();
        Assert.assertTrue(recoveryMessage.isDisplayed());
        Assert.assertEquals(recoveryMessage.getText(),"Email with instructions has been sent to you.");
    }

}
