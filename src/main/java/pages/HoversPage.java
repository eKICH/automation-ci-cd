package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoversPage {

    protected final WebDriver driver;

    private final By figureBox = By.className("figure");
    private final By figureBoxCaption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param index starts at 1
     */
    public FigureBoxCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        return new FigureBoxCaption(figure.findElement(figureBoxCaption));
    }


    // Inner class to get caption text and profile link
    public static class FigureBoxCaption {
       protected final WebElement caption;

       private final By header = By.tagName("h5");
       private final By profileLink = By.tagName("a");

       public FigureBoxCaption(WebElement caption){
           this.caption = caption;
       }

       public boolean isCaptionDisplayed() {
           return caption.findElement(header).isDisplayed();
       }

       public String getHeader(){
           return caption.findElement(header).getText();
       }

       public String getProfileLink(){
           return caption.findElement(profileLink).getAttribute("href");
       }

       public String getProfileLinkText() {
           return caption.findElement(profileLink).getText();
       }

    }

}
