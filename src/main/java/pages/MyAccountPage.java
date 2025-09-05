package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage extends PageBase{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    private WebDriverWait wait;


    @FindBy(css = "#OldPassword")
    WebElement oldPassword;
    @FindBy(css = "#NewPassword")
    WebElement newPassword;
    @FindBy(css = "#ConfirmNewPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[normalize-space()='Change password']")
    WebElement changeButton;
    @FindBy(css = ".content")
    public WebElement assertChangePassword;
    @FindBy(css = "span[title='Close']")
    WebElement closeAlert;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOut;



    public void changPassword(String oldPass,String newPass,String confirmPass){
        sendKey(newPassword,newPass);
        sendKey(oldPassword,oldPass);
        sendKey(confirmPassword,confirmPass);
        clickBtn(changeButton);
    }
    public void closeAlert(){
        clickBtn(closeAlert);
    }
    public void logOut(){
        waitForInvisibility(By.cssSelector("span[title='Close']"));
        clickBtn(logOut);
    }
}
