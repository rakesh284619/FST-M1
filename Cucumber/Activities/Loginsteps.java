
package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	
	@Given("the user is on the login page")
	public void givenclass() {
		driver.get("https://training-support.net/webelements/login-form");
		assertEquals(driver.getTitle(), "Selenium: Login Form");
	}
	
	@When("the user enters username and password")
	public void enterCred() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
	}
	
	@When("the user enters {string} and {string}")
	public void enterCredasParams(String username, String password) {
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And("clicks the submit button")
	public void click() {
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	}
	
	@Then("get the confirmation message and verify it")
	public void confirm() {
		
		String messString = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.text-gray-800"))).getText();
		
		assertEquals("Welcome Back, Admin!", messString);
		
	}
	
	@Then("get the confirmation text and verify message as {string}")
	public void confirm(String expectedMess) {
		String messString = " ";
				
		if(expectedMess.contains("Invalid"))
			messString = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2#subheading"))).getText();
		else
			messString = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.text-gray-800"))).getText();
		
		assertEquals(expectedMess, messString);
		
	}

}
