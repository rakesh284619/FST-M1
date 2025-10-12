package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//Goal: Create a new job listing
public class ProjectAct7 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void beforeclass() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://alchemy.hguy.co/jobs");

	}
	
	@Test
	public void postJob() throws InterruptedException {
		driver.findElement(By.linkText("Post a Job")).click();
		
		driver.findElement(By.id("create_account_email")).sendKeys("sample4@gmail.com");
		
		driver.findElement(By.id("job_title")).sendKeys("Example Job");
		
		WebElement select = driver.findElement(By.id("job_type"));
		
		Select dropdown = new Select(select);
		
		dropdown.selectByIndex(1);
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("job_description_ifr");
		
		System.out.println("Switched to iframe: job_description_ifr");
		
        WebElement editable = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tinymce")));
        editable.clear(); 
        editable.sendKeys("This is an automated job description entered using Selenium.");
                
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		WebElement applicationField = wait.until(ExpectedConditions.elementToBeClickable(By.id("application")));
        applicationField.sendKeys("applicant@example.com");
				
		
		driver.findElement(By.id("company_name")).sendKeys("Example company");
		
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		WebElement previewbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("job_preview_submit_button")));
		
		previewbutton.click();
		
		driver.findElement(By.linkText("click here")).click();					
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
