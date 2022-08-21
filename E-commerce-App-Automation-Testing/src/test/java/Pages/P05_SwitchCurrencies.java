package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P05_SwitchCurrencies extends PageFactory{

    public P05_SwitchCurrencies(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "customerCurrency")
    WebElement currencyElement;

    public enum currencies{
        Dollar,
        Euro
    }
    public Select currencySelector(){
        return new Select(currencyElement);
    }
    public void switchCurrency(currencies currency){
        Select currencySelector = currencySelector();
        switch (currency){
            case Dollar -> currencySelector.selectByVisibleText("US Dollar");
            case Euro -> currencySelector.selectByVisibleText("Euro");
        }
    }
}
