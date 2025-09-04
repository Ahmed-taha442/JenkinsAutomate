package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "ico-register")
    WebElement registerBtn;
    @FindBy(css = ".ico-login")
    WebElement login;

//    public void clickRegister(){
//        waitForInvisibility(By.cssSelector(".ico-register']"));
//        clickBtn(registerBtn);
//
//    }
public void clickRegister() {
    // Wait for the register button to be clickable before clicking
    // The locator used in the wait should be a By object
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(registerBtn));
    clickBtn(registerBtn);
}


    public void loginFromHome(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(login));
        clickBtn(login);
    }
}
