package Selenium;


	import static org.testng.Assert.assertEquals;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	//Goal: Read the title of the website and verify the text
	public class ProjectAct1 {
		WebDriver driver;
		@BeforeClass
		public void beforeclass() {
			driver = new FirefoxDriver();
			driver.get("https://alchemy.hguy.co/jobs");
		}
		
		@Test
		public void geTitle() {
			assertEquals("Alchemy Jobs – Job Board Application", driver.getTitle());
		}
		
		@AfterClass
		public void close() {
			driver.quit();
		}

	}
}
