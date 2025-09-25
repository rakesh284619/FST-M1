package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {

		WebDriver d = new FirefoxDriver();
		
		d.get("https://training-support.net/webelements/tables");
		
		System.out.println("Title of the page is : " + d.getTitle());
		
		// Find all column headers in the table (inside <thead>)
		List<WebElement> cols = d.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));

		// Print the number of columns found
		System.out.println("No of columns in the table are " + cols.size());

		// Find all rows in the table body (excluding header rows)
		List<WebElement> rows = d.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));

		// Print the number of rows found
		System.out.println("No of rows in the table are " + rows.size());

		// Get all cells in the third row of the table
		List<WebElement> thirdrow = d.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]"));

		// Loop through each cell in the third row and print its text
		for(WebElement s : thirdrow)
		    System.out.println("Values in 3rd row are " + s.getText());

		// Get the cell located at second row and second column
		List<WebElement> SecondRowCol = d.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]"));

		// Print the value of the specific cell
		for(WebElement s1 : SecondRowCol)
		    System.out.println("Value in 2nd row, 2nd col is " + s1.getText());

		// Close the browser
		d.close();		
		
	}

}