package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P09_AddToShoppingCart extends PageFactory{

    public P09_AddToShoppingCart(WebDriver driver) {
        super(driver);
    }

    public void clickOnAppleMacBook(){
        WebElement AppleMacBook = driver.findElement(By.xpath("//div[@class='item-grid']/div[2]/div/" +
                        "div[2]/h2/a"));
        AppleMacBook.click();
    }

    public void addAppleMacBookToCart(){
        driver.findElement(By.id("add-to-cart-button-4")).click();
    }

    public WebElement content(){
        return driver.findElement(By.className("content"));
    }

    public void closeNotification(){
        driver.findElement(By.xpath("//*[@id='bar-notification']/div/span")).click();
    }

    public void goToShoppingCart(){
        driver.findElement(By.xpath("//li[@id='topcartlink']/a")).click();
    }

    public WebElement MacBookProAsBuyableProduct(){
        return driver.findElement(By.xpath("//tbody/tr/td/a[contains(text(),'Apple MacBook Pro 13-inch')]"));
    }

}
