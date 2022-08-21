package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P07_FilterByColor extends PageFactory{

    public P07_FilterByColor(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='header-menu']/ul/li[3]")
    WebElement ApparelLi;

    public void chooseShoesSubcategoryUnderApparel(){
        Actions actions = new Actions(driver);
        actions.moveToElement(ApparelLi).perform();
        ApparelLi.findElement(By.xpath("//div[@class='header-menu']/ul/li[3]/ul/li[1]")).click();
    }

    public WebElement NikeFloralRoshe(){
        return driver.findElement(By.xpath("//div[@class='item-grid']/div[2]/div/div[2]/h2"));
    }

    public WebElement AdidasConsortium(){
        return driver.findElement(By.xpath("//div[@class='item-grid']/div[1]/div/div[2]/h2"));
    }

    public void clickRedColorCheckBox(){
        driver.findElement(By.id("attribute-option-15")).click();
    }

}
