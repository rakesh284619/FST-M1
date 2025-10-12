package Selenium;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//Goal: Read the second heading of the website and verify the text
public class ProjectAct4 {
	WebDriver driver;
	@BeforeClass
	public void beforeclass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	
	@Test
	public void pageSecondHearder() {
		String pageSecondHearder = driver.findElement(By.xpath("//article[@id='post-16']/div/h2")).getText();
		assertEquals("Quia quis non", pageSecondHearder);
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
