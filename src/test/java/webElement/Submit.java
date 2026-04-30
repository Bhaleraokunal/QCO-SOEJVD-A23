package webElement;

import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) throws InterruptedException, SocketException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement gift = driver.findElement(By.xpath("//label[@for='pollanswers-4']")) ;
		
		System.out.println(gift.getText());
		
		driver.quit();
//		
//		search.sendKeys("Computers");
//		Thread.sleep(2000);
//		search.submit();
//		Thread.sleep(2000);
//			driver.close();
		
		////label[@for='pollanswers-4']
		/////a[text()='$25 Virtual Gift Card']
	}
}
