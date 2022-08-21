package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P03_ResetPassword extends PageFactory{

    public P03_ResetPassword(WebDriver driver) {
        super(driver);
    }

    public final String ResetPasswordURL = "https://demo.nopcommerce.com/passwordrecovery";

    @FindBy(id = "Email")
    WebElement EmailTextField;

    @FindBy(name = "send-email")
    WebElement RecoveryButton;

    public void FillEmailField(String email){
        EmailTextField.sendKeys(email);
    }

    public void clickRecoveryButton(){
        RecoveryButton.click();
    }

    public WebElement isRecoveryMessageDisplayed(){
        return driver.findElement(By.className("content"));
    }

}
