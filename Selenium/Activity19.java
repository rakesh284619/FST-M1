package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		
		d.get("https://training-support.net/webelements/alerts");

			
		System.out.println("Title is : " + d.getTitle());
		
		d.findElement(By.id("confirmation")).click();
		
		Alert simpleAlert = d.switchTo().alert();
		
		System.out.println("text on alert is : " + simpleAlert.getText());
		
		simpleAlert.accept();
		
		System.out.println("action performed is : " + d.findElement(By.id("result")).getText());	
		
		d.findElement(By.id("confirmation")).click();
		
		simpleAlert = d.switchTo().alert();
		
		simpleAlert.dismiss();
		
		System.out.println("action performed is : " + d.findElement(By.id("result")).getText());		

		d.close();			


	}

}