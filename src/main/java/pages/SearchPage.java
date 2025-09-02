package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.List;
public class SearchPage extends PageBase {
    private WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // لازم تهيأه
    }

    @FindBy(xpath = "//input[@id='small-searchterms']")
    WebElement search;

    @FindBy(xpath = "//ul[@id='ui-id-1']")
    List<WebElement> listSearch;

    @FindBy(css = "a[href='/contactus']")
    WebElement contactUs ;






    public void writeSearch(String searchs){
        sendKey(search, searchs);
    }

    public void choose() {
        // استنى لما العناصر تبقى ظاهرة
        wait.until(ExpectedConditions.visibilityOfAllElements(listSearch));

        if (!listSearch.isEmpty()) {
            listSearch.get(0).click(); // يختار أول suggestion
        } else {
            throw new RuntimeException("No suggestions found!");
        }
    }

    public void scroll(){
        scrollToBottom();
    }
    public void clickContact(){
        clickBtn(contactUs);
    }
}