package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P02_Login extends PageFactory{

    public P02_Login(WebDriver driver) {
        super(driver);
    }

    public final String loginURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    @FindBy(id = "Email")
    WebElement EmailTextField;

    @FindBy(id = "Password")
    WebElement PasswordTextField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement LogInButton;

    public void FillEmailField(String email){
        EmailTextField.sendKeys(email);
    }

    public void FillPasswordField(String password){
        PasswordTextField.sendKeys(password);
    }

    public void clickLogInButton(){
        LogInButton.click();
    }

}
