package tests;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



public class TestBase {
    public static WebDriver driver;

//    public String generalEmail = "ahmed" + System.currentTimeMillis() + "@gmail.com";
public static String generalEmail ;
    public String generalPassword = "123456_Test";

    @BeforeSuite
    public void Start() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--user-data-dir=/tmp/chrome-user-data-" + System.currentTimeMillis());

         driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        driver.manage().window().maximize();
        generalEmail = "ahmed" + System.currentTimeMillis() + "@gmail.com";




    }

    @AfterSuite
    public void teerDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}