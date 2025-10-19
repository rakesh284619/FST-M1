package activities;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

//This class will contain the Before and After functions.
public class Fixtures extends BaseClass {
	//This method is executed once before all test scenarios.
    @BeforeAll
    public static void setUp() {
        // Initialize Firefox Driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    //This method is executed once after all test scenarios.
    @AfterAll
    public static void tearDown() {
        // Close the browser
        driver.quit();
    }
}
