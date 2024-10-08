    package pages;

    import org.openqa.selenium.By;
    import org.openqa.selenium.NoSuchElementException;
    import org.openqa.selenium.WebDriver;

    public class LoginPage {

        private final WebDriver driver;
        private final By userNameField = By.id("username");
        private final By passwordField = By.id("password");
        private final By loginButton = By.cssSelector("#login button");

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        public void setUserName(String username){
                driver.findElement(userNameField).clear();
                driver.findElement(userNameField).sendKeys(username);
        }

        public void setPassword(String password) {
                driver.findElement(passwordField).clear();
                driver.findElement(passwordField).sendKeys(password);
        }

        public SecureAreaPage clickLoginButton(){

            driver.findElement(loginButton).click();
            return new SecureAreaPage(driver);
        }
    }
