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
        loginPage = new LoginPage(driver);
        loginPage.login(generalEmail,generalPassword);
        System.out.println("Login done with: " + generalEmail);

        loginPage.submitBtn();

    }


//    @Test( dependsOnMethods = "validLogin")
//    public void goAccount(){
//        loginPage =new LoginPage(driver);
//        loginPage.goMyAccount();
//    }


}
