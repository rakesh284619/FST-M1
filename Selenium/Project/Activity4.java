package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
	
		WebDriver d = new FirefoxDriver();
		
		d.get("https://training-support.net/webelements/target-practice");
		
		System.out.println("Title is : " + d.getTitle());

		d.findElement(By.xpath("//h3[@class='text-3x1 font-bold text-orange-600']")).getText();
				
		System.out.println("New title : "+ d.getTitle());
		
		d.close();		

	}

}
