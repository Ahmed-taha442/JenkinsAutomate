package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
@FindBy(css = ".email")
    WebElement mail ;
    @FindBy(css = ".password")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit' and text()='Log in']")
    WebElement submit ;
    @FindBy(css = ".ico-account")
    WebElement myAccount;




    public void login(String email, String pass){
        sendKey(mail,email);
        sendKey(password,pass);

    }
    public void  submitBtn(){
        clickBtn(submit);

    }
    public void goMyAccount(){
        clickBtn(myAccount);
    }

}
