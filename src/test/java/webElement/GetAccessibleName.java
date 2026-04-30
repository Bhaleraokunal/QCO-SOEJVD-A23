package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAccessibleName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		System.out.println(driver.findElement(By.xpath("//ul[@class='top-menu']/child::li[3]/child::a"))
				.getAccessibleName());;
				
				driver.quit();
	}
}
