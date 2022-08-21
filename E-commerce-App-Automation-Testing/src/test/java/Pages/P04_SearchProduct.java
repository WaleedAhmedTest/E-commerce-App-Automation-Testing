package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P04_SearchProduct extends PageFactory{

    public P04_SearchProduct(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "small-searchterms")
    WebElement searchTextField;

    @FindBy(xpath = "//*[@id='small-search-box-form']/button")
    WebElement searchButton;

    @FindBy(xpath = "//a[contains(text(),'Lenovo IdeaCentre 600 All-in-One PC')]")
    public WebElement LenovoIdeaProduct;

    public void FillSearchField(String searchable){
        searchTextField.sendKeys(searchable);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

}
