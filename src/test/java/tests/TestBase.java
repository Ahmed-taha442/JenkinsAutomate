package tests;

import org.openqa.selenium.Dimension;
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

    public String generalEmail = "ahmed@gmai44454l.com";
    public String generalPassword = "123456_Test";

    @BeforeSuite
    public void Start() {
        ChromeOptions options = new ChromeOptions();

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            options.addArguments("--headless=new");

        }

        options.addArguments("--user-data-dir=/tmp/chrome-profile-" + System.currentTimeMillis());

        driver = new ChromeDriver(options);

        driver.manage().window().setSize(new Dimension(1440, 900));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState").equals("complete"));

    }

    @AfterSuite
    public void teerDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}