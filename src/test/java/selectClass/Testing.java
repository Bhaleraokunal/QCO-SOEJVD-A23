package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		
		WebElement dropDown = driver.findElement(By.id(""));
		
//		1.  Select kunal = new Select(dropDown);
		
//		Select kunal = new Select(driver.findElement(By.id("")));
	}
}
