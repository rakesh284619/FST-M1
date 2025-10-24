package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();        
        driver.get("https://training-support.net");
        
        System.out.println("Home Page title: " + driver.getTitle());

        WebElement aboutUsButton = driver.findElement(By.id("about-link"));
        aboutUsButton.click();

        System.out.println("New Page title: " + driver.getTitle());

        driver.quit();
    }
}
