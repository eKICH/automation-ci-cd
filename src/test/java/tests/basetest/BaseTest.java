package tests.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {

    WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() throws InterruptedException{
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Enable headless mode
        options.addArguments("--no-sandbox"); // Bypass OS security model, needed for CI
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems


        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void appUnderTest(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
