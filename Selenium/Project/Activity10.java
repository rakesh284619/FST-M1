package activities;

import java.awt.font.ImageGraphicAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {

        WebDriver d = new FirefoxDriver();
        
        Actions builder = new Actions(d);

        d.get("https://training-support.net/webelements/drag-drop");
        System.out.println("Title is : " + d.getTitle());

        WebElement football = d.findElement(By.cssSelector("img.absolute"));

        WebElement dropzone1 = d.findElement(By.id("dropzone1"));

        WebElement dropzone2 = d.findElement(By.id("dropzone2"));

        builder.clickAndHold(football)           // Click and hold the football
               .moveToElement(dropzone1)         // Move it to dropzone1
               .release()                        // Release the mouse to drop
               .build().perform();               

        String string = d.findElement(By.className("dropzone-text")).getText();

        if(string.equals("Dropped!"))
            System.out.println("Ball is dropped into dropzone1");

        // Repeat the drag-and-drop action to drop the ball into dropzone2
        builder.clickAndHold(football)
               .moveToElement(dropzone2)
               .release()
               .build().perform();

        // Verify if dropzone2 shows the "Dropped!" message and print confirmation
        if(d.findElement(By.xpath("//*[@id='dropzone2']/span")).getText().equals("Dropped!"))
            System.out.println("Ball is dropped into dropzone2");

        	
        
        // Close the browser window
        d.close();

	}

}
