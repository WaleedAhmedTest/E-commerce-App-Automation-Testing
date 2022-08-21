package StepDefinitions;

import Pages.P01_Registration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D01_Registration {
    private final WebDriver driver = Hooks.driver;
    private final P01_Registration registrationPage = new P01_Registration(driver);

    @Given("user in register page")
    public void user_in_register_page() {
        driver.navigate().to(registrationPage.RegistrationURL);
    }

    @Then("chooses male gender")
    public void chooses_male_gender() {
        registrationPage.selectGender(P01_Registration.genders.Male);
    }
    @Then("fills first and last name fields")
    public void fills_first_and_last_name_fields() {
        registrationPage.FillFirstNameField("Walid");
        registrationPage.FillLastNameField("Ahmed");
    }
    @Then("chooses a date of birth")
    public void chooses_a_date_of_birth() {
        registrationPage.DateOfBirthDaySelector().selectByValue("5");
        registrationPage.DateOfBirthMonthSelector().selectByIndex(4);
        registrationPage.DateOfBirthYearSelector().selectByVisibleText("1912");
    }
    @Then("fills email field")
    public void fills_email_field() {
        registrationPage.FillEmailField(Utils.EMAIL);
    }
    @Then("fills company name field")
    public void fills_company_name_field() {
        registrationPage.FillCompanyField("Udacity");
    }
    @Then("fills password and confirm password fields correctly")
    public void fills_password_and_confirm_password_fields_correctly() {
        registrationPage.FillPasswordField(Utils.PASSWORD);
        registrationPage.FillConfirmPasswordField(Utils.PASSWORD);
    }
    @Then("press the register button")
    public void press_the_register_button() {
        registrationPage.clickRegisterButton();
    }
    @Then("asserts registration success")
    public void asserts_registration_success() {
        String actualText = registrationPage.registrationResult();
        String expectedText = "Your registration completed";
        Assert.assertEquals(actualText,expectedText);
    }
}
