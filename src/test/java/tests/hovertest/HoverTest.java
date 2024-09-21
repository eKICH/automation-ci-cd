package tests.hovertest;

import org.testng.annotations.Test;
import tests.basetest.BaseTest;

import static org.testng.Assert.*;

public class HoverTest extends BaseTest {

    @Test(testName = "Hover Over first Figure")
    public void testHoverUser1() {
        var hoversPage = homePage.clickHoversLink();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getHeader(), "name: user1", "Incorrect header text");
        assertEquals(caption.getProfileLinkText(), "View profile", "Incorrect profile link text");
        assertTrue(caption.getProfileLink().endsWith("/users/1"));
    }

    @Test(testName = "Hover Over second Figure")
    public void testHoverUser2() {
        var hoversPage = homePage.clickHoversLink();
        var caption = hoversPage.hoverOverFigure(2);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getHeader(), "name: user2", "Incorrect header text");
        assertEquals(caption.getProfileLinkText(), "View profile", "Incorrect profile link text");
        assertTrue(caption.getProfileLink().endsWith("/users/2"));
    }

    @Test(testName = "Hover Over third Figure")
    public void testHoverUser3() {
        var hoversPage = homePage.clickHoversLink();
        var caption = hoversPage.hoverOverFigure(3);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getHeader(), "name: user3", "Incorrect header text");
        assertEquals(caption.getProfileLinkText(), "View profile", "Incorrect profile link text");
        assertTrue(caption.getProfileLink().endsWith("/users/3"));
    }
}
