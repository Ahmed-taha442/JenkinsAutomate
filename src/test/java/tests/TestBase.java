package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;
    public String generalEmail = "ahmed@gmail12.com";
    public String generalPassword = "123456_Test";


    @BeforeSuite
    @Parameters({"browser"})
    public void Start(String browse) {

        if (browse.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browse.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browse.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browse);
        }
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
    }
}
