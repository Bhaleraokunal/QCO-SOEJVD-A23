package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement addToCart = driver.findElement(By.xpath("//input[@value='Add to cart']")) ;
		
		System.out.println(addToCart.getAttribute("onclick"));
		
		driver.quit();
	}
}
