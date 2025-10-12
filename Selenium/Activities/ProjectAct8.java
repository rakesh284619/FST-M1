package Selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//Goal: Visit the site’s backend and login
public class ProjectAct8 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void beforeclass() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}
	
	@Test
	public void backEndLogin() {
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		
		assertEquals("Dashboard ‹ Alchemy Jobs — WordPress", driver.getTitle());
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}