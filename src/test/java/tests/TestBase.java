package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;

//    public String generalEmail = "ahmed" + System.currentTimeMillis() + "@gmail.com";
public String generalEmail = "fdfdf7@g55z555m5ail.com";
    public String generalPassword = "123456_Test";

    @BeforeSuite
    public void Start() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");
// اجعل كل run له user-data-dir مختلف
        options.addArguments("--user-data-dir=/tmp/chrome-user-data-" + System.currentTimeMillis());

         driver = new ChromeDriver(options);

        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterSuite
    public void teerDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}