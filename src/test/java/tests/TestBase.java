package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;
    public String generalEmail = "ahmed@gmai485555545444l858.com";
    public String generalPassword = "123456_Test";


    @BeforeSuite

    public void Start() {
        ChromeOptions options = new ChromeOptions();


        driver = new ChromeDriver();
        options.addArguments("--headless");
        driver.get("https://demo.nopcommerce.com/");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState").equals("complete"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void teerDown(){
        driver.quit();
    }
}
