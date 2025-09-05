package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    protected WebDriver driver ;
    public WebDriverWait wait;
    protected Actions action;


    public  PageBase (WebDriver driver){
        this.driver = driver;
        PageFactory .initElements(driver,this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        action = new Actions(driver);


    }
    protected  void clickBtn(WebElement Button){
        waitForvisibility(Button);
        wait.until(ExpectedConditions.elementToBeClickable(Button));

        Button.click();
    }
    protected static void sendKey(WebElement item , String text){
        item.sendKeys(text);
    }
    public void waitForInvisibility(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    public void waitForvisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void scrollToBottom() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    protected void hoverOverElement(WebElement element) {
        action.moveToElement(element).perform();
    }


    protected void hoverAndClick(WebElement element) {
        action.moveToElement(element).click().perform();
    }
}
