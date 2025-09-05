package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#gender-male")
    WebElement gender ;
    @FindBy(css = "#FirstName")
    WebElement firstNme ;
    @FindBy(css = "#LastName")
    WebElement lastName ;
    @FindBy(css = "#Email")
    WebElement mail;
    @FindBy(css = "#Company")
    WebElement company;
    @FindBy(css = "#Password")
    WebElement password;
    @FindBy(css = "#ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(css = "#register-button")
    WebElement submit ;
    @FindBy(css = ".result")
    public WebElement successMessage;
    @FindBy(css = ".ico-logout")
    public WebElement logOut;



    public void successsfulRegistration (String fName, String lName, String email, String nameCompany, String userPassword, String userConfirmPass){
        clickBtn(gender);
        sendKey(firstNme,fName);
        sendKey(lastName,lName);
        sendKey(mail,email);
        sendKey(company,nameCompany);
        sendKey(password,userPassword);
        sendKey(confirmPassword,userConfirmPass);
        clickBtn(submit);



    }
    public void logouts (){
        clickBtn(logOut);
    }



}
