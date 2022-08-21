package Pages;

import org.openqa.selenium.WebDriver;

    public class PageFactory {
        protected WebDriver driver;

        public PageFactory(WebDriver driver){
            this.driver = driver;
            org.openqa.selenium.support.PageFactory.initElements(driver, this);
        }
}
