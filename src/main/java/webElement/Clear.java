package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Kunal") ;
		Thread.sleep(2000) ;
		driver.findElement(By.id("small-searchterms")).clear() ;
		Thread.sleep(2000) ;
		driver.findElement(By.id("small-searchterms")).sendKeys("Selenium") ;
	}
}
