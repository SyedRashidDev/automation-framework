package stepdefinition;

import cucumber.api.java.en.Given;
import framework.HomePage;
import org.testng.Assert;

public class AssertionSD {

    HomePage homePage = new HomePage();

    @Given("^I am on (.+) page")
    public void checkPage(String title) {
        Assert.assertEquals(DriverWrapper.getDriver().getTitle(), homePage.getTitle(title), "Invalid Page");
    }
}
