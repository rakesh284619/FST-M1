package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity2 {

	public static void main(String[] args) {
	
		WebDriver d = new FirefoxDriver();
			
		d.get("https://training-support.net/webelements/login-form");
		
		System.out.println("Title is : " + d.getTitle());
		
		d.findElement(By.id("username")).sendKeys("admin");

		d.findElement(By.name("password")).sendKeys("password");
		
		d.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		
		System.out.println("New title : "+ d.getTitle());
		
		d.close();	

	}

}

