import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Create FirefoxDriver instance
        driver = new FirefoxDriver();
        // Open the given URL
        driver.get("https://training-support.net/webelements/target-practice/");
    }

    @Test
    public void exampleTest() {
        // For now, just print the page title
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.close();
    }
}
