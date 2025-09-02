package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "ico-register")
    WebElement registerBtn;
    @FindBy(css = ".ico-login")
    WebElement login;

    public void clickRegister(){
        clickBtn(registerBtn);
    }

    public void loginFromHome(){
        clickBtn(login);
    }
}
