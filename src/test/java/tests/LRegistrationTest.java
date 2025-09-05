package tests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;

public class LRegistrationTest extends TestBase{
    HomePage homeObject ;
    RegistrationPage registrationObject ;


    @Test
    public void UserCanRegisterSuccessfully() {
        homeObject = new HomePage(driver);
        homeObject.clickRegister();
        registrationObject = new RegistrationPage(driver);
        registrationObject.successsfulRegistration("Ahmed", "Taha", generalEmail, "Samh", generalPassword, generalPassword);
        System.out.println(" Registration done with: " + generalEmail);
        registrationObject.logouts();
    }


}
