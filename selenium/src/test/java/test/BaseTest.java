package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//The first Selenium TestNG test.

public class BaseTest {

    // -----------------------------------------------------Global Variables--------------------------------------------------------------------
    // Declare a Webdriver variable
    public WebDriver driver;

    //Declare a test URL variable
    public String testURL = "https://www.zatro.es/";

    //------------------------------------------------------Test Setup--------------------------------------------------------------------------
    @BeforeMethod
    public void setupTest (){
        //Create a new ChromeDriver
    	System.setProperty("webdriver.chrome.driver", "C:\\Utils\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1300, 1000));

        driver.navigate().to(testURL);
    }
    

    //-----------------------------------------------------Test TearDown------------------------------------------------------------------------
    @AfterMethod
    public void teardownTest (){
        //Close browser and end session
        driver.quit();
    }
}
