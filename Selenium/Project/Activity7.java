package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://training-support.net/webelements/dynamic-controls");
		
		System.out.println("Title is : " + d.getTitle());
		
		WebElement textbox = d.findElement(By.id("textInput"));
		
		if (textbox.isEnabled())
			System.out.println(textbox.getText());
		else {
			d.findElement(By.id("textInputButton")).click();
			textbox.sendKeys("sample text");
			System.out.println("data in text box is " + textbox.getDomProperty("value"));
		}
	
		d.close();	

	}

}
