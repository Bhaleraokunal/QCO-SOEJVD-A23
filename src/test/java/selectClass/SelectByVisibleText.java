package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/books");
		
		WebElement dropDown = driver.findElement(By.id("products-orderby"));
		
		Select sel = new Select(dropDown);
		
		sel.selectByVisibleText("Price: Low to High");
		
		Thread.sleep(4000);
		
		driver.quit();
	}
}
