package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import pages.SearchPage;

public class SearchTest extends TestBase{

    SearchPage searchPage;
    HomePage homeObject;
    LoginPage loginPage;
    RegistrationPage registrationObject ;

    @Test
    public void registrationSuccessfully(){
        homeObject = new HomePage(driver);
        homeObject.clickRegister();
        registrationObject = new RegistrationPage(driver);
        registrationObject.successsfulRegistration("Ahmed","Taha",generalEmail,"Samh",generalPassword,"123456_Test");



    }
    @Test
    public void  logout (){


        registrationObject.logouts();
    }

    @Test(dependsOnMethods = "logout")
    public void login(){
        homeObject=new HomePage(driver);
        homeObject.loginFromHome();
    }

    @Test (dependsOnMethods = "login")
    public void validLogin(){
        loginPage = new LoginPage(driver);
        loginPage.login(generalEmail,generalPassword);
        loginPage.submitBtn();

    }

    @Test(dependsOnMethods = "validLogin")
    public void writeSearch(){
        searchPage=new SearchPage(driver);
        searchPage.writeSearch("apple");
    }


    @Test(dependsOnMethods = "writeSearch")
    public void selectFirist(){
        searchPage.choose();
    }

    @Test(dependsOnMethods = "selectFirist")
    public void contacts(){
        searchPage=new SearchPage(driver);

        searchPage.scrollToBottom();
        searchPage.clickContact();
    }





}
