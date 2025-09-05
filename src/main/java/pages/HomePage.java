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

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerBtn;
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement login;

//
public void clickRegister() {
    waitForvisibility(registerBtn);
    //
    clickBtn(registerBtn);
}


    public void loginFromHome(){
    waitForvisibility(login);

        clickBtn(login);
    }
}
