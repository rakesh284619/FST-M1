package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		 	WebDriver d = new FirefoxDriver();
		 	
		 	WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
	        
	        d.get("https://training-support.net/webelements/dynamic-attributes");
	        
//	        Find the input fields and type in the required data in the fields.
//	        Wait for success message to appear and print it to the console.
	      //*[@id="full-name-b25d"]
	        // Enter the full name into the input field whose ID starts with 'full-name'
	        d.findElement(By.xpath("//input[starts-with(@id, 'full-name')]")).sendKeys("Rakesh kumar");

	        // Enter the email into the input field whose ID contains '-email'
	        d.findElement(By.xpath("//input[contains(@id, '-email')]")).sendKeys("rakesh@gmail.com");

	        // Enter the event date into the input field whose name contains '-event-date'
	        d.findElement(By.xpath("//input[contains(@name, '-event-date')]")).sendKeys("2002-09-01");

	        // Enter additional details into the textarea whose ID contains 'additional-details'
	        d.findElement(By.xpath("//textarea[contains(@id, 'additional-details')]")).sendKeys("jumba");

	        // Click the 'Submit' button with exact text 'Submit'
	        d.findElement(By.xpath("//button[text()='Submit']")).click();

	        // Wait until the confirmation message with ID 'action-confirmation' becomes visible and get its text
	        String string = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();

	        	        
	        System.out.println(string);	        
	                   
	        // Close the browser window
	        d.close();

	}

}
