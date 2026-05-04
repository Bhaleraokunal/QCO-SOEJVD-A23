package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		System.out.println("Before Selecting the button");
		System.out.println(driver.findElement(By.cssSelector("[id='pollanswers-2']")).isSelected());
		
		
		driver.findElement(By.cssSelector("[id='pollanswers-2']")).click();
		
		
		System.out.println("After Selecting the button");
		System.out.println(driver.findElement(By.cssSelector("[id='pollanswers-2']")).isSelected());
		
		
		driver.quit();
		
		
		
	}
}
