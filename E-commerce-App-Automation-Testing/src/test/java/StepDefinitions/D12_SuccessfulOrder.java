package StepDefinitions;

import Pages.P12_SuccessfulOrder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Locale;

public class D12_SuccessfulOrder {

    private final WebDriver driver = Hooks.driver;
    P12_SuccessfulOrder successfulOrderPage = new P12_SuccessfulOrder(driver);

    @Given("user in shopping cart page")
    public void user_in_shopping_cart_page() {
        driver.navigate().to(successfulOrderPage.shoppingCartURL);
    }
    @Then("user chooses to wrap the gift")
    public void user_chooses_to_wrap_the_gift() {
        successfulOrderPage.chooseToWrapTheProduct(true);
    }
    @Then("user agrees to policies")
    public void user_agrees_to_policies() {
        successfulOrderPage.checkPolicyCheckBox();
    }
    @Then("user checks out")
    public void user_checks_out() {
        successfulOrderPage.Checkout();
    }

    @Then("user fills billing address")
    public void user_fills_billing_address() {
        successfulOrderPage.selectEgyptAsCountry();
        successfulOrderPage.fillCityField("city");
        successfulOrderPage.fillAddress1Field("address");
        successfulOrderPage.fillZipField("123");
        successfulOrderPage.fillPhoneNumberField("010101010101010");
        successfulOrderPage.BillingContinueButton().click();
    }

    @Then("user chooses shipping method")
    public void user_chooses_shipping_method() {
        successfulOrderPage.chooseNextDayAir();
        successfulOrderPage.ShippingContinueButton().click();
    }
    @Then("user finishes remaining steps and confirms order")
    public void user_finishes_remaining_steps_and_confirms_order() {
        successfulOrderPage.PaymentMethodContinueButton().click();
        successfulOrderPage.PaymentInfoContinueButton().click();
        successfulOrderPage.pressConfirm();
    }
    @Then("user checks the success of the order")
    public void user_checks_the_success_of_the_order() throws InterruptedException {
        Thread.sleep(2000);
        String expectedURL = "https://demo.nopcommerce.com/checkout/completed";
        String actualURL = driver.getCurrentUrl().toLowerCase(Locale.ROOT);
        Assert.assertEquals(actualURL,expectedURL);

        successfulOrderPage.FinalStepContinueButton().click();
        expectedURL = Utils.HOME_PATH_URL;
        actualURL = driver.getCurrentUrl().toLowerCase(Locale.ROOT);
        Assert.assertEquals(expectedURL,actualURL);
    }



}
