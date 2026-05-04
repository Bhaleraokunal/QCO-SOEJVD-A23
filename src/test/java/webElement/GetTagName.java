package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTagName {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement img = driver.findElement(By.cssSelector("[alt='Tricentis Demo Web Shop']"));
		
		System.out.println(img.getTagName());
		
		//System.out.println();
		
		driver.quit();
	}
}
