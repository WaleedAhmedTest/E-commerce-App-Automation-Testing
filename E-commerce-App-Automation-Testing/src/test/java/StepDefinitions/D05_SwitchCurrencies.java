package StepDefinitions;

import Pages.P05_SwitchCurrencies;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D05_SwitchCurrencies {
    private final WebDriver driver = Hooks.driver;
    P05_SwitchCurrencies switchCurrenciesPage = new P05_SwitchCurrencies(driver);

    @Then("user change currency to Euro")
    public void user_change_currency_to_euro() {
        switchCurrenciesPage.switchCurrency(P05_SwitchCurrencies.currencies.Euro);
        String currentCurrency = switchCurrenciesPage.currencySelector().getFirstSelectedOption().getText();
        String expectedCurrency = "Euro";
        Assert.assertEquals(currentCurrency,expectedCurrency);
    }
    @Then("user changes currency back to dollar")
    public void user_changes_currency_back_to_dollar() {
        switchCurrenciesPage.switchCurrency(P05_SwitchCurrencies.currencies.Dollar);
        String currentCurrency = switchCurrenciesPage.currencySelector().getFirstSelectedOption().getText();
        String expectedCurrency = "US Dollar";
        Assert.assertEquals(currentCurrency,expectedCurrency);
    }
}
