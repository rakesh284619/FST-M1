package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		
		d.get("https://training-support.net/webelements/selects");
			
		System.out.println("Title is : " + d.getTitle());

		WebElement select1 = d.findElement(By.cssSelector("select.h-80"));
		
		Select multiselect = new Select(select1);
//		Select the "HTML" option using the visible text.
		multiselect.selectByVisibleText("HTML");

//		Select the 4th, 5th and 6th options using the index.		
		multiselect.selectByIndex(3);
		multiselect.selectByIndex(4);
		multiselect.selectByIndex(5);

//		Select the "Node" option using the value.
		multiselect.selectByValue("nodejs");

//		Deselect the 5th option using index.
		multiselect.deselectByIndex(4);
		
		System.out.println("Final Selected options are : ");
		for(WebElement value : multiselect.getAllSelectedOptions())
			System.out.println(value.getText());		
		
		d.close();			


	}

}
