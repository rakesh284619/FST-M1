import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.Reporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class Activity8 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set path for GeckoDriver if needed
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
        driver = new FirefoxDriver();
        Reporter.log("Browser started successfully", true);
    }

    @BeforeMethod
    public void beforeMethod() {
        // Open a test page before each test
        driver.get("https://www.example.com");
        Reporter.log("Navigated to example.com", true);
    }

    @Test
    public void testExample() {
        // Example test: check page title
        String title = driver.getTitle();
        Reporter.log("Page Title is: " + title, true);

        // Example usage of By locator
        driver.findElement(By.tagName("h1"));

        // Example alert handling (if exists)
        try {
            Alert alert = driver.switchTo().alert();
            Reporter.log("Alert text: " + alert.getText(), true);
            alert.accept();
        } catch (Exception e) {
            Reporter.log("No alert present", true);
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
        Reporter.log("Browser closed successfully", true);
    }
}
