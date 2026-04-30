package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		for (int i = 1; i <=2 ; i++) {
			
			if (i==2) {
				driver.findElement(By.xpath("(//input[@type='text'])["+i+"]")).sendKeys("Hello") ;
			}
		}
	}
}
