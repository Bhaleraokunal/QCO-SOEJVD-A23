package selectClass;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetterMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement drop = driver.findElement(By.cssSelector("[name='Month']"));
		
		Select sel = new Select(drop);
		
		for (int i = 0; i < 12; i++) {
			sel.selectByIndex(i);
		}
		
		sel.deselectAll();
	}
}
