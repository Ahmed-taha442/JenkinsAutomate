package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;

    public String generalEmail = "ahmed@gmai44l.com";
    public String generalPassword = "123456_Test";

    @BeforeSuite
    public void Start() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterSuite
    public void teerDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}