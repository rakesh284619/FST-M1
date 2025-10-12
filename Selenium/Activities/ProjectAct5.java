package Selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//Goal: Navigate to the “Jobs” page on the site
public class ProjectAct5 {
	WebDriver driver;
	@BeforeClass
	public void beforeclass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	
	@Test
	public void jobslink() {
		driver.findElement(By.linkText("Jobs")).click();
		
		assertEquals("Jobs – Alchemy Jobs", driver.getTitle());
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
