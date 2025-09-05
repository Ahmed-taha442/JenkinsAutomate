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
public String generalEmail = "fdfdf7@g55z55m5ail.com";
    public String generalPassword = "123456_Test";

    @BeforeSuite
    public void Start() {
        ChromeOptions options = new ChromeOptions();


        options.addArguments("--headless");

        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver();

        // ضبط حجم الشاشة
        driver.manage().window().setSize(new Dimension(1920, 2000));

        // فتح الموقع
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterSuite
    public void teerDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}