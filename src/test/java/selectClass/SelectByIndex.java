package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/books");
		WebElement drop = driver.findElement(By.id("products-orderby"));
		Select sel= new Select(drop);
		
		System.out.println(sel.isMultiple());;
		
		//sel.selectByIndex(3);
		
		
		
		
//		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
//		WebElement country = driver.findElement(By.cssSelector("[name='country']"));
//		
//		Select sel = new Select(country);
//		
//		for (int i = 0; i < 50; i++) {
//			sel.selectByIndex(i);
//			Thread.sleep(300);
//		}
//		
		
		
	} 
}
