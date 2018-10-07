package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import framework.BasePage;
import framework.HomePage;
import framework.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class InteractionSD {

    private HomePage homePage = new HomePage();
    private SearchPage searchPage = new SearchPage();

    @When("^I click on (.+)$")
    public void clickOnButton(By locator){
        homePage.clickOn(locator);
    }

    @When("^I enter (.+) into (searchField)")
    public void enterTextIntoField(String text, )



}
