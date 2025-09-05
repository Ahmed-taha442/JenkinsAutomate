package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegistrationPage;

public class TC03MyAccountTest extends TestBase{
    MyAccountPage myAccountPage;
    LoginPage loginPage;
    HomePage homePage ;
    RegistrationPage registrationObject ;

    @Test(priority = 1)
    public void goMyAccount(){
        myAccountPage=new MyAccountPage(driver);
        myAccountPage.changPassword(generalPassword,"123456","123456");
        myAccountPage.closeAlert();
        myAccountPage.logOut();
        homePage=new HomePage(driver);
        homePage.loginFromHome();
        loginPage = new LoginPage(driver);
        loginPage.login(generalEmail,"123456");
        loginPage.submitBtn();



    }
//
}