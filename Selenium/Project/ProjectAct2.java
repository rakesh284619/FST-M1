package Selenium;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//Goal: Read the heading of the website and verify the text
public class ProjectAct2 {
	WebDriver driver;
	@BeforeClass
	public void beforeclass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	
	@Test
	public void getHeading() {
		String pagetitle = driver.findElement(By.cssSelector("h1.entry-title")).getText();
		assertEquals("Welcome to Alchemy Jobs", pagetitle);
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
