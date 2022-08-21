package StepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;

    @BeforeAll
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver",Utils.CHROME_DRIVER_EXE);
        driver = new ChromeDriver();

        // driver configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

    }

    @AfterAll
    public static void quitDriver() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
