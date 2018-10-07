package stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverWrapper {

    private static WebDriver driver = null;
    private static String URL = "http://automationpractice.com";

    @Before
    public static void before(){

        System.setProperty("webriver.chrome.driver","C:\\Users\\Syed\\desktop\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);


    }

    @After
    public static void after(){
        if (driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
        }

    }

    public static WebDriver getDriver(){ return driver; }

}
