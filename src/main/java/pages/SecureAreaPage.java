package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private final WebDriver driver;
    private final By secureAreaBanner = By.className("flash");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getBannerText() {
       return driver.findElement(secureAreaBanner).getText();
    }

}
