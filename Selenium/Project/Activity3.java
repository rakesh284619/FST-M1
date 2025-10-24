package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(10));
		
		d.get("https://training-support.net/webelements/login-form");
		
		System.out.println("Title is : " + d.getTitle());

		d.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		d.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("password");
		
		d.findElement(By.xpath("//button[@data-svelte-h='svelte-gtkoxm']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(@class,'text-gray-800')]")));
		
		String str = d.findElement(By.xpath("//h2[contains(@class,'text-gray-800')]")).getText();
		
		System.out.println(str);
		
		System.out.println("New title : "+ d.getTitle());
		
		d.close();	
	}

}
