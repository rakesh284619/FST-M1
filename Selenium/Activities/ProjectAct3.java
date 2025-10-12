package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//Goal: Print the url of the header image to the console
public class ProjectAct3 {
	WebDriver driver;
	@BeforeClass
	public void beforeclass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	
	@Test
	public void geturl() {
		String image = driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println("url of the image is :" + image);
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}