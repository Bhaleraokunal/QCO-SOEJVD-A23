package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verfication {

	public static String expectedUrl = "https://demowebshop.tricentis.com/";
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://youtube.com");
		
		String currentUrl = driver.getCurrentUrl();
		
		if (expectedUrl.equals(currentUrl)) {
			
			 driver.findElement(By.id("small-searchterms")).sendKeys("Books"); // NosuchElementXception.
		}
		else {
			driver.quit();
		}
	}
	
}
