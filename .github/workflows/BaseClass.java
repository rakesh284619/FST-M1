package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//BaseClass: This class will contain static object for those libraries 
//that will be used across all step definitions, like driver, wait, etc.
public class BaseClass {
    // Create a new instance of the Firefox driver
    static WebDriver driver;
    static WebDriverWait wait;
}
