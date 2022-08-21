package Pages;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class P06_SelectCategory extends PageFactory{

    public P06_SelectCategory(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='header-menu']/ul/li[2]")
    WebElement ElectronicsLi;

    @FindBy(xpath = "//div[@class='header-menu']/ul/li[5]")
    WebElement BooksLi;

    public void chooseCellPhonesSubcategoryUnderElectronics(){
        // to enable the subcategory list Actions was used to hover on the electronics category first
        Actions actions = new Actions(driver);
        actions.moveToElement(ElectronicsLi).perform();
        // now we get the web element of cell phones under electronics using xpath and click on it
        ElectronicsLi.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]/ul/li[2]")).click();
    }

    public void chooseBooksCategory(){
        BooksLi.click();
    }

}
