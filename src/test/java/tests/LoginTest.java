package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {
    HomePage homeObject;
    LoginPage loginPage;

    @Test
    public void login(){
        homeObject=new HomePage(driver);
        homeObject.loginFromHome();
    }


    @Test
    public void validLogin(){
        loginPage = new LoginPage(driver);
        loginPage.login(generalEmail,generalPassword);
        loginPage.submitBtn();

    }
    @Test( dependsOnMethods = "validLogin")
    public void goAccount(){
        loginPage =new LoginPage(driver);
        loginPage.goMyAccount();
    }


}
