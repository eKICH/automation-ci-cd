package tests.logintest;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import tests.basetest.BaseTest;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureArea = loginPage.clickLoginButton();
        assertTrue(secureArea.getBannerText()
                        .contains("You logged into a secure area!"),
                "Incorrect Text");
;    }
}
