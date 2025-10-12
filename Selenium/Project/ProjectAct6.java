package Selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//Goal: Search for a job and apply for it
public class ProjectAct6 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void beforeclass() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://alchemy.hguy.co/jobs");
	}
	
	@Test
	public void applyJob() {
		driver.findElement(By.linkText("Jobs")).click();
		
		driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Banking");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Search completed')]")));
		
		driver.findElement(By.xpath("//*[@id='post-7']/div/div/ul/li[1]/a")).click();
		
		driver.findElement(By.className("application_button")).click();
		
		System.out.println("To apply for this job email your details to :" + driver.findElement(By.className("job_application_email")).getText());
				
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}