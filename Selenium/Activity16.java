package activities;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		
		// Open the webpage that contains dropdown elements
		d.get("https://training-support.net/webelements/selects");

		// Print the title of the page to verify it's loaded correctly
		System.out.println("Title is : " + d.getTitle());

		// Locate the dropdown element using its CSS class 'h-10'
		WebElement select1 = d.findElement(By.cssSelector("select.h-10"));

		// Create a Select object to interact with the dropdown
		Select dropdown = new Select(select1);

		// Select the option with visible text "Two"
		dropdown.selectByVisibleText("Two");

		// Print the selected option after choosing by visible text
		System.out.println("second option using the visible text : " + dropdown.getFirstSelectedOption().getText());

		// Select the third option using its index (index starts from 0)
		dropdown.selectByIndex(2);

		// Print the selected option after choosing by index
		System.out.println("third option using the index : " + dropdown.getFirstSelectedOption().getText());

		// Select the option using its value attribute (value="three")
		dropdown.selectByValue("two");

		// Print the selected option after choosing by value
		System.out.println("fourth option using the value : " + dropdown.getFirstSelectedOption().getText());

		// Loop through all available options in the dropdown and print their text
		System.out.println("All the availble options are: ");
		for(WebElement value : dropdown.getOptions())
		    System.out.println(value.getText());

		// Close the browser window
		d.close();

	}

}
