package suiteExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
      
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");
    }

    @Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password) {
        
        WebElement userField = driver.findElement(By.id("username"));
        WebElement passField = driver.findElement(By.id("password"));
        
      
        userField.sendKeys(username);
        passField.sendKeys(password);

       
        driver.findElement(By.cssSelector("button[type='submit']")).click();


        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login Message: " + message);
    }

    @AfterClass
    public void tearDown() {
    	
        driver.quit();
    }
}

