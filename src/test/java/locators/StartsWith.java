package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWith {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[starts-with(@class,'s')]"))
		.sendKeys("Hello!Good Afternoon");
	}
}
