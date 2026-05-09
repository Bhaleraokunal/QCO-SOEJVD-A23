package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement country = driver.findElement(By.cssSelector("[name='country']"));
		
		Select sel = new Select(country);
		
		sel.selectByValue("IN");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
