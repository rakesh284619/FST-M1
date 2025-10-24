package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
       // Create a new Firefox browser instance
        WebDriver d = new FirefoxDriver();
        
        // Create an Actions object to perform mouse actions like click, double-click, right-click, etc.
        Actions builder = new Actions(d);
        
        // Open the target webpage
        d.get("https://training-support.net/webelements/mouse-events");
        
        // Print the title of the page to the console
        System.out.println("Title is : " + d.getTitle());
        
        // Locate the elements on the page using their text
        WebElement cargolock = d.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargotoml = d.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement src = d.findElement(By.xpath("//h1[text()='src']"));
        WebElement target = d.findElement(By.xpath("//h1[text()='target']"));
        
        // Perform a sequence of actions:
        // 1. Click on "Cargo.lock"
        // 2. Wait for 1 second
        // 3. Move to "Cargo.toml"
        // 4. Wait for 1 second
        // 5. Click on "Cargo.toml"
        // build().perform() executes the entire sequence
        builder.click(cargolock).pause(1000).moveToElement(cargotoml).pause(1000).click(cargotoml).build().perform();
        
        // Print the result of the above actions
        System.out.println("Result on the action performed is :" + d.findElement(By.id("result")).getText());
        
        // Perform another sequence:
        // 1. Double-click on "src"
        // 2. Wait for 1 second
        // 3. Right-click (context click) on "target"
        // 4. Wait for 1 second
        // perform() executes this sequence directly
        builder.doubleClick(src).pause(1000).contextClick(target).pause(1000).perform();
        
        // Click on the "Open" option from the right-click menu
        builder.click(d.findElement(By.xpath("//span[text()='Open']"))).pause(1000).build().perform();
        
        // Print the final result after all actions
        System.out.println("final result of the actions is : " + d.findElement(By.id("result")).getText());     
        
        // Close the browser
        d.close();  
    }	

	}

