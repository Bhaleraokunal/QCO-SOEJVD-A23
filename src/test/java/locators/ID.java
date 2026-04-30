package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ; // launching the browser
 		driver.manage().window().maximize();  // maximization 
		driver.get("https://demowebshop.tricentis.com/"); // load your url in the browser.
		
		driver.findElement(By.id("small-searchterm")).sendKeys("Selenium");
	}
}
