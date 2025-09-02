package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void openGoogleTest() {
        // شغل المتصفح (هيبقى ChromeHeadless في GitHub Actions)
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        String title = driver.getTitle();

        // Assertion بسيط
        Assert.assertTrue(title.contains("Google"));
    }
}
