package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P10_AddToWishList extends PageFactory{

    public P10_AddToWishList(WebDriver driver) {
        super(driver);
    }

    public void addAppleMacBookToWishList(){
        driver.findElement(By.id("add-to-wishlist-button-4")).click();
    }

    public WebElement content(){
        return driver.findElement(By.className("content"));
    }

    public void closeNotification(){
        driver.findElement(By.xpath("//*[@id='bar-notification']/div/span")).click();
    }

    public void goToWishList(){
        driver.findElement(By.xpath("//div[@class='header-links']/ul/li[3]/a")).click();
    }

}
