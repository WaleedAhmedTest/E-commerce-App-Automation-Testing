package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class P01_Registration extends PageFactory {

    public P01_Registration(WebDriver driver) {
        super(driver);
    }

    public final String RegistrationURL = "https://demo.nopcommerce.com/register?returnUrl=%2F";

    @FindBy(how = How.ID, using = "gender-male")
    WebElement genderMaleRadioButton;

    @FindBy(id = "gender-female")
    WebElement genderFemaleRadioButton;

    @FindBy(id = "FirstName")
    WebElement FirstNameTextField;

    @FindBy(id = "LastName")
    WebElement LastNameTextField;

    @FindBy(name = "DateOfBirthDay")
    WebElement DateOfBirthDaySelector;

    @FindBy(name = "DateOfBirthMonth")
    WebElement DateOfBirthMonthSelector;

    @FindBy(name = "DateOfBirthYear")
    WebElement DateOfBirthYearSelector;

    @FindBy(id = "Email")
    WebElement EmailTextField;

    @FindBy(id = "Company")
    WebElement CompanyTextField;

    @FindBy(id = "Password")
    WebElement PasswordTextField;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPasswordTextField;

    @FindBy(id = "register-button")
    WebElement RegisterButton;

    public enum genders {
        Male,
        Female
    }

    public void selectGender(genders gender){
        switch (gender) {
            case Male -> genderMaleRadioButton.click();
            case Female -> genderFemaleRadioButton.click();
        }
    }

    public void FillFirstNameField(String name){
        FirstNameTextField.sendKeys(name);
    }

    public void FillLastNameField(String name){
        LastNameTextField.sendKeys(name);
    }

    public Select DateOfBirthDaySelector(){
        return new Select(DateOfBirthDaySelector);
    }

    public Select DateOfBirthMonthSelector(){
        return new Select(DateOfBirthMonthSelector);
    }

    public Select DateOfBirthYearSelector(){
        return new Select(DateOfBirthYearSelector);
    }

    public void FillEmailField(String email){
        EmailTextField.sendKeys(email);
    }

    public void FillCompanyField(String company){
        CompanyTextField.sendKeys(company);
    }

    public void FillPasswordField(String password){
        PasswordTextField.sendKeys(password);
    }

    public void FillConfirmPasswordField(String password){
        ConfirmPasswordTextField.sendKeys(password);
    }

    public void clickRegisterButton(){
        RegisterButton.click();
    }

    public String registrationResult(){
        WebElement result = driver.findElement(By.className("result"));
        System.out.println(result.getText());
        return result.getText();
    }
}

