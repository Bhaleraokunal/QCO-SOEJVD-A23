package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 
		
		 for (WebElement webElement : allLinks) {
			System.out.println(webElement.getText() );
		}
		 
		 System.out.println(allLinks);
		 
		 driver.quit(); // which is 
	}
	
}
