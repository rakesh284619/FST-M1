package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity14 {

	public static void main(String[] args) {
		// Create a new Firefox browser instance
        WebDriver d = new FirefoxDriver();
        
        d.get("https://training-support.net/webelements/tables");
        
//        Using xpaths on the table:
//        	Find the number of rows and columns in the table and print them.
//        	Find and print the Book Name in the 5th row.
//        	Click the header of the Price column to sort it in ascending order.
//        	Find and print the Book Name in the 5th row again.
        	
        List<WebElement> cols = d.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
        System.out.println("Tot no of cols in table are : " + cols.size());
        
        List rows = d.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
        System.out.println("Tot no of rows in table are : " + rows.size());
        
        WebElement cellvalue = d.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]"));
        
        System.out.println("book name in 5th row is : " + cellvalue.getText());
        
        d.findElement(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th[5]")).click();
        
        cellvalue = d.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]"));
        
        System.out.println("book name in 5th row after sorting 	 : " + cellvalue.getText());       
        
                   
        // Close the browser window
        d.close();

	}

}
