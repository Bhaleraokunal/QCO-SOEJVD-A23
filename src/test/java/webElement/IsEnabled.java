package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabled {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	
		System.out.println(driver.findElement(By.cssSelector("[id='pollanswers-2']")).isEnabled());
		
		
		
		
		driver.quit();
		
		
		
	}
}
