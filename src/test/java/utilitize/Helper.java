package utilitize;

import org.openqa.selenium.WebDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Helper {
    public static void capatureScreanshoot(WebDriver driver , String screenShoot){
        Path dest = Paths.get("./Screenshoots",screenShoot+".png");

    }
}
