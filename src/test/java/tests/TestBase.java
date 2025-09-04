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

    public String generalEmail = "ahmed@gmai444l.com";
    public String generalPassword = "123456_Test";

    @BeforeSuite
    public void Start() {
        ChromeOptions options = new ChromeOptions();

        // لو على Linux (GitHub Actions) استخدم headless
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
        }

        // حل مشكلة user data directory
        options.addArguments("--user-data-dir=/tmp/chrome-profile-" + System.currentTimeMillis());

        driver = new ChromeDriver(options);

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterSuite
    public void teerDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}