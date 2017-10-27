package wdrivertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class show how to use selenium web driver
 * https://github.com/julianommartins/seleniumWebDriver
 * @author julianom
 *
 */
public class WebDriverExample  {
    public static void main(String[] args) {
		// If you want to load a existing profile
		// Option 1
		// ProfilesIni profile = new ProfilesIni();
		// FirefoxProfile julianoProf = profile.getProfile("default");
		// FirefoxOptions options = new FirefoxOptions().setProfile(julianoProf);
		//
		// Option 2
		// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		// capabilities.setCapability("marionette", true);
		// capabilities.setCapability(FirefoxDriver.PROFILE, julianoProf);
    	
    	// you need to download geckodriver (https://github.com/mozilla/geckodriver/releases)
    	// and extract to your machine (this example is for Linux, if you 
    	// are using windows, change to your local folder and add the .exe extension
		System.setProperty("webdriver.gecko.driver", "/opt/geckodriver/geckodriver");

		
		// option 1 to use existing profile
		//WebDriver driver = new FirefoxDriver(options);
		// option 2 to use existing profile
		//WebDriver driver = new FirefoxDriver(capabilities);
		
		WebDriver driver = new FirefoxDriver();

        // Opening Google
        driver.get("http://www.google.com");

        // q its the search box name/ID
        WebElement element = driver.findElement(By.name("q"));

        // Seaching for Juliano Marcos Martins - me
        element.sendKeys("Juliano Marcos Martins");
        
        // Submit the form
        element.submit();

        // Printing the page title - just for example
        System.out.println("Page title is: " + driver.getTitle());

		// If you want to Close the browser, uncomment this line
		// driver.quit();
    }
}
