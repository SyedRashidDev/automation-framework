package framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.DriverWrapper;

public class BasePage {


    public WebElement findElement(By locator) {

        WebElement element;
        element = DriverWrapper.getDriver().findElement(locator);

        return element;
    }

    public void clickOn(By locator){

        findElement(locator).click();

    }

    public void enterText(By locator, String text){

        findElement(locator).sendKeys(text);

    }

    public String getTitle(String title){
        return title;
    }
}

