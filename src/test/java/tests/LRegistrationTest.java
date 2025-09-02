package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;

public class LRegistrationTest extends TestBase{
    HomePage homeObject ;
    RegistrationPage registrationObject ;

    @Test
    public void registrationSuccessfully(){
        homeObject = new HomePage(driver);
        homeObject.clickRegister();
        registrationObject = new RegistrationPage(driver);
        registrationObject.successsfulRegistration("Ahmed","Taha",generalEmail,"Samh",generalPassword,"123456_Test");
        Assert.assertEquals("Your registration completed",
                registrationObject.successMessage.getText());


    }
    @Test(dependsOnMethods = "registrationSuccessfully")
    public void  logout (){


        registrationObject.logouts();
    }


}
