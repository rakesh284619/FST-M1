package activities;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePagesteps extends BaseClass {
	//Below text in "" is copied from Activity1.feature
	@Given ("the user is on the TS home page")
	public void openhomepage() {
		driver.get("https://training-support.net");
		Assertions.assertEquals(driver.getTitle(), "Training Support");
	}
	
	@When ("they click on About Us page")
	public void clickbutton() {
		driver.findElement(By.linkText("About Us")).click();
		
	}
	
	@Then ("they are redirected to About US page")
	public void verifypage() {
		Assertions.assertEquals(driver.getTitle(), "About Training Support");
	}
	

}
