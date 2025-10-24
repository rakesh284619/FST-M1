
package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
	
		WebDriver d = new FirefoxDriver();
		
		d.get("https://training-support.net/webelements/dynamic-controls");
		
		System.out.println("Title is : " + d.getTitle());
		
		WebElement checkbox = d.findElement(By.id("checkbox"));
		
		if (checkbox.isEnabled())
			System.out.println("checkbox is enabled");
		else 
			System.out.println("checkbox is disabled");
		
		d.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		System.out.println("is check box displayed"+ checkbox.isDisplayed());
		
		d.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		System.out.println("is check box displayed"+ checkbox.isDisplayed());

		d.close();		
}

}
