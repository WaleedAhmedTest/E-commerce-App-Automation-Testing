package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P12_SuccessfulOrder extends PageFactory{

    public P12_SuccessfulOrder(WebDriver driver) {
        super(driver);
    }

    public String shoppingCartURL = "https://demo.nopcommerce.com/cart";

    private Select WrapProductSelector(){
        WebElement WrapProduct = driver.findElement(By.id("checkout_attribute_1"));
        return new Select(WrapProduct);
    }

    private WebElement policyCheckBox(){
        return driver.findElement(By.id("termsofservice"));
    }

    private WebElement CheckoutButton(){
        return driver.findElement(By.id("checkout"));
    }

    private Select CountrySelector(){
        return new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
    }

    private WebElement CityTextField(){
        return driver.findElement(By.id("BillingNewAddress_City"));
    }

    private WebElement Address1Field(){
        return driver.findElement(By.id("BillingNewAddress_Address1"));
    }

    private WebElement ZipCodeField(){
        return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }

    private WebElement PhoneNumberField(){
        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }

    public WebElement BillingContinueButton(){
        return driver.findElement(By.xpath("//*[@id='billing-buttons-container']/button[4]"));
    }

    public WebElement ShippingContinueButton(){
        return driver.findElement(By.xpath("//*[@id='shipping-method-buttons-container']/button"));
    }

    public WebElement PaymentMethodContinueButton(){
        return driver.findElement(By.xpath("//*[@id='payment-method-buttons-container']/button"));
    }

    public WebElement PaymentInfoContinueButton(){
        return driver.findElement(By.xpath("//*[@id='payment-info-buttons-container']/button"));
    }

    public WebElement FinalStepContinueButton(){
        return driver.findElement(By.className("order-completed-continue-button"));
    }

    private WebElement NextDayAirRadioButton(){
        return driver.findElement(By.id("shippingoption_1"));
    }

    private WebElement ConfirmOrderButton(){
        return driver.findElement(By.xpath("//*[@id='confirm-order-buttons-container']/button"));
    }


    public void chooseToWrapTheProduct(boolean choice){
        Select wrapSelector = WrapProductSelector();
        if(choice){
            wrapSelector.selectByValue("1");
            return;
        }
        wrapSelector.selectByValue("2");
    }

    public void checkPolicyCheckBox(){
        policyCheckBox().click();
    }

    public void Checkout(){
        CheckoutButton().click();
    }

    public void selectEgyptAsCountry(){
        CountrySelector().selectByVisibleText("Egypt");
    }

    public void fillCityField(String city){
        CityTextField().sendKeys(city);
    }

    public void fillAddress1Field(String address){
        Address1Field().sendKeys(address);
    }

    public void fillZipField(String zip){
        ZipCodeField().sendKeys(zip);
    }

    public void fillPhoneNumberField(String phoneNumber){
        PhoneNumberField().sendKeys(phoneNumber);
    }

    public void chooseNextDayAir(){
        NextDayAirRadioButton().click();
    }

    public void pressConfirm(){
        ConfirmOrderButton().click();
    }

}
