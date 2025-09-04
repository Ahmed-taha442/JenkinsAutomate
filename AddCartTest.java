package tests;

import org.testng.annotations.Test;
import pages.*;

public class AddCartTest extends TestBase {
    HomePage homeObject;
    LoginPage loginPage;
    RegistrationPage registrationObject ;
    AddCartPage addCartPage ;

    @Test(priority = 1)
    public void registrationSuccessfully(){
        homeObject = new HomePage(driver);
        homeObject.clickRegister();
        registrationObject = new RegistrationPage(driver);
        registrationObject.successsfulRegistration("Ahmed","Taha",generalEmail,"Samh",generalPassword,"123456_Test");



    }
    @Test(dependsOnMethods = "registrationSuccessfully" ,priority = 2)
    public void  logout (){


        registrationObject.logouts();
    }

    @Test(dependsOnMethods = "logout" ,priority = 3)
    public void login(){
        homeObject=new HomePage(driver);
        homeObject.loginFromHome();
    }

    @Test (dependsOnMethods = "login",priority = 4)
    public void validLogin(){
        loginPage = new LoginPage(driver);
        loginPage.login(generalEmail,generalPassword);
        loginPage.submitBtn();

    }
    @Test (dependsOnMethods = "validLogin",priority = 5)
    public void goPage(){
        addCartPage = new AddCartPage(driver);
        addCartPage.goTODesktops();

    }
    @Test(dependsOnMethods = "goPage",priority = 5)
    public void testAddSpecificProductToCart() {
        addCartPage.addCart("Digital Storm VANQUISH Custom Performance PC");
    }

}
