package tests.dropdowntest;

import org.testng.annotations.Test;
import tests.basetest.BaseTest;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTest {

    @Test
    public void testDropDownSelect() {
        var dropDownPage = homePage.clickDropDownLink();

        String option = "Option 2";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selection");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
