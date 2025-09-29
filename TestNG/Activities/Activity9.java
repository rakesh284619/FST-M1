

	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;

	public class Activity9 {
	    WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");
	    }

	    @Test
	    public void verifyTitle() {
	        String expectedTitle = "Google";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    
	}

	}
