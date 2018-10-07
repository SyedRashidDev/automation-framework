package framework;

import org.openqa.selenium.By;
import stepdefinition.DriverWrapper;

public class HomePage extends BasePage {


    private By searchField = By.id("search_query_top");
    private By searchButton = By.id("//*[@id='searchbox']/button");
    private BasePage page = new HomePage();
    private String title = "My Store";

//    public String getTitle(){
//        return title;
//    }

}
