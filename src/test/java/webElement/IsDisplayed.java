package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://x.com/");
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//span[text()='Create account']")).isDisplayed());;
		
		
		driver.quit();
	}
}
