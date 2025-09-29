import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
       
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");
    }

    @Test
    public void testTitle() {
        
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

      
        WebElement aboutLink = driver.findElement(By.id("about-link"));
        aboutLink.click();
    }

    @DataProvider(name = "searchData")
    public Object[][] searchProvider() {
        return new Object[][] {
            {"Selenium"},
            {"TestNG"},
            {"Automation"}
        };
    }

    @Test(dataProvider = "searchData")
    public void testSearch(String keyword) {
        System.out.println("Searching for: " + keyword);
      
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
