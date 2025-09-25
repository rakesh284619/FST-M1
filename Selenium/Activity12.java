package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		// Create a new Firefox browser instance
        WebDriver d = new FirefoxDriver();
        
        // Create a WebDriverWait object to wait up to 10 seconds for a specific condition to be met
	    // This helps handle dynamic elements that may take time to appear or become clickable
	    WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));


        d.get("https://training-support.net/webelements/dynamic-content");
        
//        Find and click the "Click me!" button.
//        Wait till the word "release" appears.
//        Get the text and print it to console.
        
        d.findElement(By.xpath("//button[text() = 'Click me!']")).click();
	    // Wait until the element with ID 'word' contains the text "release"
        // Once the condition is true, print the current text of that element to the console
        if (wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release")))
        	System.out.println("word found is " + d.findElement(By.id("word")).getText());          
            
        // Close the browser window
        d.close();


	}

}