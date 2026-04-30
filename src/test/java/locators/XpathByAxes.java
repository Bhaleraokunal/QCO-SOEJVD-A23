package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//driver.findElement(By.xpath("//li[@class='answer']/input")).click();
		
		
		driver.findElement(By.xpath("//input[@type='submit']/preceding-sibling::input"))
		.sendKeys("GOT");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@role='status']/following-sibling::input")).clear();
	}
}
