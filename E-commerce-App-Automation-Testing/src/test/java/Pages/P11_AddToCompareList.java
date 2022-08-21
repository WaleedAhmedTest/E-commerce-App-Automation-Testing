package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P11_AddToCompareList extends PageFactory{

    public P11_AddToCompareList(WebDriver driver) {
        super(driver);
    }

    public void addHTCOneToCompareListDirectly(){
        driver.findElement(By.xpath("//div[@class='item-grid']/div[3]/div/" +
                        "div[2]/div[3]/div[2]/button[2]"))
                .click();
    }

    public void addAppleMacBookToCompareList(){
        driver.findElement(By.xpath("//div[@class='compare-products']/button")).click();
    }

    public WebElement content(){
        return driver.findElement(By.className("content"));
    }

    public void closeNotification(){
        driver.findElement(By.xpath("//*[@id='bar-notification']/div/span")).click();
    }

    public void goToCompareList(){
        content().findElement(By.tagName("a")).click();
    }

    public WebElement HTCOneAsBuyableProduct(){
        return driver.findElement(By.xpath("//tbody/tr/td/a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]"));
    }

}
