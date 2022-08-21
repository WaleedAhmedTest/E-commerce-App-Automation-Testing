package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P08_SelectTags extends PageFactory{

    public P08_SelectTags(WebDriver driver) {
        super(driver);
    }

    public final String selectTagsURL = "https://demo.nopcommerce.com/computers";

    @FindBy(xpath = "//div[@class='tags']/ul/li[10]")
    WebElement gameTag;

    public void clickOnGameTag(){
        gameTag.click();
    }

    public WebElement pageTitle(){
        return driver.findElement(By.className("page-title"));
    }

}
