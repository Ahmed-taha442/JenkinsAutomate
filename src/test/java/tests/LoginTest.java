package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginTest extends TestBase {
    HomePage homeObject;
    LoginPage loginPage;


    @Test
    public void login(){
        homeObject=new HomePage(driver);
        homeObject.loginFromHome();
        loginPage = new LoginPage(driver);
        loginPage.login(generalEmail,generalPassword);

        loginPage.submitBtn();

    }


    @Test( dependsOnMethods = "login")
    public void goAccount(){
        loginPage.goMyAccount();
        loginPage.myAccount();


    }



}
