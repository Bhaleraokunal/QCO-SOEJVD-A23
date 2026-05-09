package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
//		WebElement drop = driver.findElement(By.cssSelector("[name='Month']"));
	WebElement drop = driver.findElement(By.cssSelector("[name='country']"));
		
		Select sel = new Select(drop);
		List<WebElement> allOptions = sel.getOptions();
		
	
		for (int i = 1; i < allOptions.size(); i++) {
			
			WebElement option = allOptions.get(i);
		}
		
		for (WebElement option : allOptions) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for (WebElement webElement : allOptions) {
//			
//			//System.out.println(webElement.getText()); // all the options
//			
//			sel.selectByVisibleText(webElement.getText());
//		}
		
		
		
		driver.quit();
	}
}
