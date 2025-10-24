package activities;

import java.awt.Button;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
	    WebDriver d = new FirefoxDriver();
        
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));


        d.get("https://training-support.net/webelements/dynamic-controls");
        
        WebElement checkbox = d.findElement(By.id("checkbox"));
        
        d.findElement(By.xpath("//button[text() = 'Toggle Checkbox']")).click();

	    wait.until(ExpectedConditions.invisibilityOf(checkbox));
        
        System.out.println("visibility of checkbox : " + checkbox.isDisplayed());
           
        d.findElement(By.xpath("//button[text() = 'Toggle Checkbox']")).click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        
        System.out.println("visibility of checkbox : " + checkbox.isDisplayed());        
        
        d.close();

	}

}
