package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String parent = driver.getWindowHandle() ;
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		Set<String> child = driver.getWindowHandles(); 
		
		for (String string : child) {
			if (!parent.equals(string)) {
				driver.switchTo().window(string) ;
				
			}
		}
	}
}
