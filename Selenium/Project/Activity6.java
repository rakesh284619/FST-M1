package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {
	
		WebDriver d = new FirefoxDriver();
		
		d.get("https://training-support.net/webelements/dynamic-controls");
		
		System.out.println("Title is : " + d.getTitle());
		
		WebElement checkbox = d.findElement(By.id("checkbox"));
		
		if (checkbox.isSelected())
			System.out.println("checkbox is selected");
		else {
			System.out.println("checkbox is not selected");
			checkbox.click();
		}

		System.out.println("is check box selected : "+ checkbox.isSelected());
		
		d.close();	

	}

}
