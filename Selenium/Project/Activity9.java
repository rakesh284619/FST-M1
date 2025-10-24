package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
        WebDriver d = new FirefoxDriver();
        
        Actions builder = new Actions(d);

        d.get("https://training-support.net/webelements/keyboard-events");

        System.out.println("Title is : " + d.getTitle());

        builder.sendKeys("Hello!").sendKeys(Keys.RETURN).build().perform();

        System.out.println("message in console is : " + d.findElement(By.cssSelector("h1.mt-3")).getText());

        d.close();
 
    }	

	}

