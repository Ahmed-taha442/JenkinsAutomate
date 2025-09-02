package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;
import java.util.List;

public class AddCartPage extends PageBase{
    public AddCartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath= "(//a[normalize-space()='Computers'])[1]")
    WebElement computer;
    @FindBy(xpath = "(//a[normalize-space()='Desktops'])[1]")
    WebElement desktops ;
    @FindBy(xpath = "//div[@class='details']/h2")
    List<WebElement> headers ;

    @FindBy(xpath = "//div[@class='buttons']/button[@class='button-2 product-box-add-to-cart-button']")
    List<WebElement> addToCart ;



public void goTODesktops(){
    hoverOverElement(computer);
    hoverAndClick(desktops);
}
public void addCart(String product){
    for (int i = 0; i < headers.size(); i++) {
        String name = headers.get(i).getText().trim();
        if (name.equalsIgnoreCase(product)) {
            clickBtn(addToCart.get(i));
           break;
        }
    }
}

}
