package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegistrationPage;

public class MyAccountTest extends TestBase{
    MyAccountPage myAccountPage;
    LoginPage loginPage;
    HomePage homePage ;
    RegistrationPage registrationObject ;

    @Test(priority = 1)
    public void goMyAccount(){
        myAccountPage=new MyAccountPage(driver);
        myAccountPage.myAccount();
        myAccountPage.changPassword(generalPassword,"123456","123456");
        Assert.assertEquals(myAccountPage.assertChangePassword.getText(),"Password was changed");
        myAccountPage.closeAlert();
        myAccountPage.logOut();
        homePage=new HomePage(driver);
        homePage.loginFromHome();
        loginPage = new LoginPage(driver);
        loginPage.login(generalEmail,"123456");
        loginPage.submitBtn();



    }
//    @Test(priority = 2)
//    public void changePassword(){
//        myAccountPage.changPassword(generalPassword,"123456","123456");
//        Assert.assertEquals(myAccountPage.assertChangePassword.getText(),"Password was changed");
//    }
//    @Test(priority = 3)
//    public void closeAlert(){
//        myAccountPage.closeAlert();
//    }
//    @Test(priority = 4)
//    public void  logout (){
//        myAccountPage.logOut();
//    }
//    @Test(priority = 5)
//    public void login(){
//        homePage=new HomePage(driver);
//        homePage.loginFromHome();
//    }
//
//    @Test(priority = 6)
//    public void validLogin(){
//        loginPage = new LoginPage(driver);
//        loginPage.login(generalEmail,"123456");
//        loginPage.submitBtn();
//
//    }
}